package com.nwu.mapper;

/**
 * @author Rex Joush
 * @time 2021.06.05 15:58
 */

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nwu.entities.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * 测试接口，后期不需要
 */
@Mapper
public interface UserMapper extends BaseMapper<Student> {

}
