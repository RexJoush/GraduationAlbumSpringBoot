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
     * @return
     */
    int checkedBullet(int id, String passTime);

    /**
     * 获取审核通过的留言列表，300条
     * @return 列表
     */
    List<BulletVo> getBullets();
}
