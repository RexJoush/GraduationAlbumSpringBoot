package com.nwu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nwu.entities.Bullet;
import com.nwu.entities.vo.BulletVo;

import java.util.List;

/**
 * @author Rex Joush
 * @time 2021.06.21 14:04
 */

public interface BulletService extends IService<Bullet> {

    /**
     * 设置某条留言已通过
     * @param id 留言 id
     * @param passTime 通过的时间
     * @return 通过条数
     */
    int checkedPassBullet(int id, String checkTime, String passTime);

    /**
     *
     * @param id 留言 id
     * @param checkTime 审核的时间
     * @return 审核未通过条数
     */
    int checkedNotPass(int id, String checkTime);

    /**
     * 获取审核通过的留言列表，300条
     * @return 列表
     */
    List<BulletVo> getBullets();
}
