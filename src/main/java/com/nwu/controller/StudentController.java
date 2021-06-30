package com.nwu.controller;

import com.nwu.entities.StudentInfo;
import com.nwu.entities.vo.BulletVo;
import com.nwu.service.BulletService;
import com.nwu.service.StudentService;
import com.nwu.util.CASUtil;
import com.nwu.util.Result;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Rex Joush
 * @time 2021.06.16 19:41
 */

@RestController
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;

    @Resource
    private BulletService bulletService;

    @Resource
    private RedisTemplate<Object, Object> redisTemplate;

    @GetMapping("/getStudentInfo")
    public String getStudentInfo(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String number = CASUtil.getAccountNameFromCas(request);

        ValueOperations<Object, Object> integerValueOperations = redisTemplate.opsForValue();

        if (!"".equals(number)) {
//            System.out.println("访问者 ：" + loginName);

             request.getSession().setAttribute("number", number);
            StudentInfo studentInfo = studentService.getStudentInfo(number);


            // 不为空，返回学生信息
            if (studentInfo != null){
                // 毕业生的成功访问
                integerValueOperations.increment("studentVisit");
                List<BulletVo> bullets = bulletService.getBullets();
                Map<String, Object> result = new HashMap<>();

                result.put("studentInfo", studentInfo);
                result.put("bullets", bullets);

                return Result.ok("获取学生信息成功", result);
            }
            // 为空，说明非毕业生
            else {
                return Result.info(1201, "非毕业生，请毕业再来！");
            }



//            result.put("code", 1200);
//            result.put("message", "获取学生信息成功");
//            result.put("data", studentInfo);

        } else {
            // 其他用户的访问
            integerValueOperations.increment("otherVisit");
            response.sendRedirect("/index.html");
            return Result.error("获取学生信息失败");

//            result.put("code", 1400);
//            result.put("message", "获取学生信息失败");
        }


        // 获取学生所有信息
//        if (number != null) {
//            StudentInfo studentInfo = studentService.getStudentInfo(number);
//            result.put("code", 1200);
//            result.put("message", "获取学生信息成功");
//            result.put("data", studentInfo);
//        } else {
//            result.put("code", 1400);
//            result.put("message", "获取学生信息失败");
//        }

        // return JSON.toJSONString(result);

    }

}
