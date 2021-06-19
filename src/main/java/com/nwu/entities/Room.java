package com.nwu.entities;

/**
 * @author Rex Joush
 * @time 2021.06.16 19:34
 */

import com.baomidou.mybatisplus.annotation.TableField;

/**
 * 宿舍信息实体类
 */
public class Room {

    @TableField("number")
    private String number;      // 学号
    @TableField("name")
    private String name;        // 姓名
    @TableField("campus")
    private String campus;      // 校区

    @TableField("apartment")
    private String apartment;   // 公寓楼号
    @TableField("dormitory")
    private int dormitory;      // 宿舍号
    @TableField("bed")
    private int bed;            // 床位号
}
