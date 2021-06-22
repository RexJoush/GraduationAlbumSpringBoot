package com.nwu.entities;

/**
 * @author Rex Joush
 * @time 2021.06.09 09:18
 */

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 弹幕留言实体类
 */
@TableName("def_bullet2021")
@Data
public class Bullet {

    @TableId(value = "id", type = IdType.AUTO)
    private int id;             // 弹幕 id

    @TableField("number")
    private String number;         // 学号
    @TableField("name")
    private String name;        // 获奖姓名

    @TableField("content")
    private String content;     // 弹幕内容

    @TableField("is_pass")
    private int isPass;         // 是否已审核过

    @TableField("created_time")
    private String createTime;  // 提交时间

    @TableField("pass_time")
    private String passTime;    // 审核通过时间

}
