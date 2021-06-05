package com.nwu.entities;

/**
 * @author Rex Joush
 * @time 2021.06.05 15:59
 */

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 测试实体类，后期不需要
 */
@Data
@TableName("user")
public class User {

    @TableId(value = "id", type = IdType.AUTO)
    private int id;
    private String name;
    private int age;
    private String email;

}
