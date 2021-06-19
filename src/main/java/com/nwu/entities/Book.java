package com.nwu.entities;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Rex Joush
 * @time 2021.06.16 19:25
 */

/*
    借书信息实体类
 */
@TableName
@Data
public class Book {

    @TableField("number")
    private String number;          // 学号

    @TableField("first_loan_time")
    private String firstLoanTime;   // 第一次借阅的时间

    @TableField("total_times")
    private int totalTimes;         // 总借阅的次数

    @TableField("total_loan")
    private int totalLoan;          // 总借阅的本数

    @TableField("book_name")
    private String bookName;        // 借阅最长时间的书名
}
