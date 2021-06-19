package com.nwu.entities.page;

/**
 * @author Rex Joush
 * @time 2021.06.09 09:50
 */

import lombok.Data;

/**
 * 第 5 页
 */

@Data
public class Page5 {

    private String campus;      // 校区名称，长安校区，太白校区等
    private String apartment;   // 公寓楼号， 2号楼，等等
    private String dormitory;   // 宿舍号
    private String bed;         // 床位号
    private int roommates;      // 宿舍人数

    private String major;       // 专业名称


}
