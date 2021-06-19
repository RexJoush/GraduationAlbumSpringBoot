package com.nwu.mapper;

import com.nwu.entities.vo.StudentInfoVo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Rex Joush
 * @time 2021.06.16 19:56
 */

@Mapper
public interface StudentInfoMapper {
    /**
     * 通过学号查询当前用户的所有信息
     * @param number 学号
     * @return 当前用户的所有信息
     */
    StudentInfoVo getStudentInfo(String number);
}
