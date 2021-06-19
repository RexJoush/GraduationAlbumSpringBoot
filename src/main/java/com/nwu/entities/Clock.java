package com.nwu.entities;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Rex Joush
 * @time 2021.06.16 19:28
 */

/**
 * 疫情打卡信息
 */
@TableName("stu_clock2021")
@Data
public class Clock {

    @TableField("number")
    private String number;          // 学号
    @TableField("clock_location")
    private String clockLocation;   // 打卡地点
    @TableField("clock_time")
    private String clockTime;       // 打卡时间
    @TableField("clock_times")
    private int clockTimes;         // 打卡次数

}
