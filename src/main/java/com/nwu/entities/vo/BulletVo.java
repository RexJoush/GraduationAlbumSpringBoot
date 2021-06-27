package com.nwu.entities.vo;

/**
 * @author Rex Joush
 * @time 2021.06.22 10:54
 */

import lombok.Data;

import java.io.Serializable;

/**
 * 查询的弹幕结果，用于前端展示弹幕列表
 */
@Data
public class BulletVo implements Serializable {

    private int id;             // 弹幕 id
    private String number;      // 发送弹幕的学生学号
    private String name;        // 发送弹幕的学生名称
    private String content;     // 弹幕内容

}
