package com.nwu.entities;

/**
 * @author Rex Joush
 * @time 2021.06.11 10:51
 */

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 奖励列表
 *
 * 2019 年 你荣获西北大学一等奖学金
 */
@Data
@TableName("stu_reward2021")
public class Reward implements Serializable {

    @TableField("number")
    private String number;      // 获奖学号
    @TableField("name")
    private String name;        // 获奖姓名

    @TableField("department")
    private String department;  // 院系

    @TableField("award")
    private String award;       // 奖励类型

    @TableField("year")
    private String year;        // 获奖年份


}
