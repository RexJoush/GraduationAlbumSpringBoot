package com.nwu.service;

import com.nwu.entities.StudentInfo;
import com.nwu.entities.vo.StudentInfoVo;

/**
 * @author Rex Joush
 * @time 2021.06.16 19:42
 */

public interface StudentService {

    /**
     * 通过学号查询当前用户的所有信息
     * @param number 学号
     * @return 当前用户的所有信息
     */
    StudentInfo getStudentInfo(String number);

    /**
     * 获取用户的姓名，弹幕接口需要
     * @param number 学号
     * @return 当前学号的姓名
     */
    String getStudentName(String number);

}
