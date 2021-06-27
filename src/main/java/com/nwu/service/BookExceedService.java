package com.nwu.service;

/**
 * @author Rex Joush
 * @time 2021.06.26 20:31
 */

public interface BookExceedService {

    /**
     * 获取学号排名
     * @param number 查询的学号
     * @return 当前用户的排名，1，19，等
     */
    int getRank(String number);

    /**
     * 获取总人数
     * @return 总人数
     */
    int getTotal();


    /**
     * 获取当前用户所超越的人数百分比
     * @param number 学号
     * @return 百分比的数量。50% 返回 50
     */
    int getExceed(String number);
}
