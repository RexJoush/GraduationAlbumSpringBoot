package com.nwu.entities.page;

/**
 * @author Rex Joush
 * @time 2021.06.09 09:51
 */

import lombok.Data;

import java.io.Serializable;

/**
 * 第 9 页
 */
@Data
public class Page9 implements Serializable {

    private String firstCourseTime;     // 第一门课的上课日期
    private String firstCourseName;     // 第一门课的课程名称
    private int totalCourses;            // 总上课门数
    private int totalCredit;            // 总学分数
    private int totalClassHours;        // 上课总时长

}
