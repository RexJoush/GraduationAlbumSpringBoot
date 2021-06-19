package com.nwu.entities.page;

/**
 * @author Rex Joush
 * @time 2021.06.09 09:51
 */

import lombok.Data;

import java.util.List;

/**
 * 第 10 页
 */
@Data
public class Page10 {

    // private List<String> locations;         // 疫情期间打卡地点

    /* 彩虹体育馆数据，北校区不展示 */
    private int gymTimes;                  // 预约体育馆的次数

}
