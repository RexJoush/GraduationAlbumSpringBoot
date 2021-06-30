package com.nwu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nwu.entities.Bullet;
import com.nwu.entities.vo.BulletVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author Rex Joush
 * @time 2021.06.21 14:05
 */
@Mapper
public interface BulletMapper extends BaseMapper<Bullet> {

    @Update("UPDATE def_bullet2021 SET is_pass = 1, is_check = 1, check_time = #{checkTime}, pass_time = #{passTime} where id = #{id}")
    int checkedBullet(int id, String checkTime, String passTime);

    @Update("UPDATE def_bullet2021 SET is_pass = 0, is_check = 1, check_time = #{checkTime} where id = #{id}")
    int checkedNotPass(int id, String checkTime);
}
