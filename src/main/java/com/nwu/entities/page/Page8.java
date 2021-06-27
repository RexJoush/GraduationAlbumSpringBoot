package com.nwu.entities.page;

/**
 * @author Rex Joush
 * @time 2021.06.09 09:51
 */

import lombok.Data;

import java.io.Serializable;

/**
 * 第 8 页
 */
@Data
public class Page8 implements Serializable {

    private String firstToLibrary;      // 第一次进图书馆的时间
    private int totalTimesLibrary;      // 进图书馆的次数
    private int totalLoan;              // 借书的本数
    private String bookName;            // 最长时间借阅的书名
    private int exceeds;                // 去图书馆次数 超越的人数百分比

}
