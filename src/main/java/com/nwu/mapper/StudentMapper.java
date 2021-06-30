package com.nwu.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author Rex Joush
 * @time 2021.06.21 14:18
 */

@Mapper
public interface StudentMapper {

    @Select("select name from def_result2021 where number = #{number}")
    String getStudentName(String number);

}
