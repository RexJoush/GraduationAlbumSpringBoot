package com.nwu.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nwu.entities.Bullet;
import com.nwu.service.BulletService;
import com.nwu.service.StudentService;
import com.nwu.util.CASUtil;
import com.nwu.util.Result;
import com.nwu.util.TimeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author Rex Joush
 * @time 2021.06.20 17:31
 */

@RestController
@RequestMapping("/bullet")
public class BulletController {

    @Resource
    private BulletService bulletService;

    @Resource
    private StudentService studentService;

    /**
     * 添加弹幕
     * @param content 内容
     * @return 返回结果
     */
    @GetMapping("/addBullet")
    public String addBullet(HttpServletRequest request, @RequestParam("content") String content){

        boolean save = false;
        String number = CASUtil.getAccountNameFromCas(request);
        System.out.println(number);

        if (!"".equals(number) && !"".equals(content)){

            // 设置弹幕信息
            Bullet bullet = new Bullet();
            bullet.setNumber(number);
            bullet.setName(studentService.getStudentName(number));
            bullet.setContent(content);
            bullet.setIsPass(0); // 首次提交均为未审核过
            bullet.setCreateTime(TimeUtils.simpleDateFormat.format(new Date()));

            save = bulletService.save(bullet);
        }

        return save ? Result.ok("添加成功"): Result.error("添加失败");

    }


    /**
     * 按页获取未审核的弹幕列表
     * @param currentPage 页码
     * @return 弹幕列表
     */
    @GetMapping("/getUnchecked")
    public String getUncheckedBullet(@RequestParam(value = "currentPage", defaultValue = "1") int currentPage){

        // 获取 Page 对象
        Page<Bullet> userPage = new Page<>(currentPage, 10);

        QueryWrapper<Bullet> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("is_pass", 0); // 查询未审核过的

        Page<Bullet> page = bulletService.page(userPage, queryWrapper);
        HashMap<String, Object> map = new HashMap<>();
        map.put("bullets", page.getRecords());
        map.put("current", page.getCurrent());
        map.put("total", page.getTotal());

        return Result.ok("获取弹幕列表成功", map);

    }

    /**
     * 提交审核弹幕
     * @param ids id 列表
     * @return 提交成功的次数
     */
    @GetMapping("/checkBullets")
    public String check(@RequestParam("ids") List<Integer> ids){

        String passTime = TimeUtils.simpleDateFormat.format(new Date());

        int count = 0;

        if (ids.size() > 0) {
            for (Integer id : ids) {
                if (bulletService.checkedBullet(id, passTime) > 0){
                    count++;
                }
            }
        } else {
            return Result.error("提交失败,数据个数为 0");
        }

        return Result.ok("提交成功", count);

    }

}
