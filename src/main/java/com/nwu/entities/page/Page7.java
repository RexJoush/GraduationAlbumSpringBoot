package com.nwu.entities.page;

/**
 * @author Rex Joush
 * @time 2021.06.09 09:50
 */

import lombok.Data;

import java.io.Serializable;

/**
 * 第 7 页
 */
@Data
public class Page7 implements Serializable {

    private String firstToCanteen;      // 第一次进食堂时间
    private String firstPos;            // 第一次进食堂位置
    private double firstCost;           // 第一次消费金额
    private String firstMeal;           // 第一次吃的饭
    private int totalTimesCanteen;      // 进食堂的次数
    private String favoriteMeal;        // 最喜欢的菜
    private int favoriteMealTimes;      // 最喜欢的菜吃的次数

}
