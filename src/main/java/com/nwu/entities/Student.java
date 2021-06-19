package com.nwu.entities;

/**
 * @author Rex Joush
 * @time 2021.06.05 15:59
 */

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 用户实体类，包括用户基本信息
 */
@Data
@TableName("stu_all2021")
public class Student {

    @TableField("number")
    private String number;      // 学号
    @TableField("name")
    private String name;        // 姓名
    @TableField("birthday")
    private int birthday;       // 出生日期
    @TableField("department")
    private int department;     // 院系代码
    @TableField("major")
    private String major;       // 专业名称

    @TableField("student_type")
    private String studentType; // 学生类型。博士生，研究生，本科生

    @TableField("grade")
    private int grade;          // 入学年份
    @TableField("campus")
    private String campus;      // 校区，长安校区，太白校区等
    @TableField("apartment")
    private String apartment;   // 公寓楼号
    @TableField("dormitory")
    private int dormitory;      // 宿舍号
    @TableField("bed")
    private int bed;            // 床位号

}
