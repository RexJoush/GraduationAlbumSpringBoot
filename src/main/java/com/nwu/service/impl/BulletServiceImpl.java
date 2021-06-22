package com.nwu.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nwu.entities.Bullet;
import com.nwu.entities.vo.BulletVo;
import com.nwu.mapper.BulletMapper;
import com.nwu.mapper.BulletVoMapper;
import com.nwu.service.BulletService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Rex Joush
 * @time 2021.06.21 14:04
 */
@Service
public class BulletServiceImpl extends ServiceImpl<BulletMapper, Bullet> implements BulletService {

    @Resource
    private BulletMapper bulletMapper;

    @Resource
    private BulletVoMapper bulletVoMapper;


    @Override
    public int checkedBullet(int id, String passTime) {
        return bulletMapper.checkedBullet(id, passTime);
    }

    @Override
    public List<BulletVo> getBullets() {
        return bulletVoMapper.getBullets();
    }
}
