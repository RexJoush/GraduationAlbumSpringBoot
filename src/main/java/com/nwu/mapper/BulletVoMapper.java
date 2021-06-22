package com.nwu.mapper;

import com.nwu.entities.vo.BulletVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Rex Joush
 * @time 2021.06.22 11:18
 */
@Mapper
public interface BulletVoMapper {

    List<BulletVo> getBullets();
}
