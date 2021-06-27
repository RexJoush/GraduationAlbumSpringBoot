package com.nwu.entities;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Rex Joush
 * @time 2021.06.16 19:30
 */

/**
 * 课程信息实体类
 */
@TableName("stu_course2021")
@Data
public class Course implements Serializable {

    @TableField("number")
    private String number;          // 学号

    @TableField("total_credit")
    private int totalCredit;        // 总学分

    @TableField("total_class_hours")
    private int totalClassHours;    // 总课时

    @TableField("total_courses")
    private int totalCourses;       // 总课程数
}
