package com.nwu.entities;

/**
 * @author Rex Joush
 * @time 2021.06.29 17:03
 */

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 在毕业生表中的毕业生学号
 */
@Data
@TableName("def_graduation_user")
public class GraduateUser {

    // 在毕业表中的学号
    @TableId("number")
    private String number;

}
