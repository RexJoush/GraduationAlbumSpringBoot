package com.nwu.entities.vo;

/**
 * @author Rex Joush
 * @time 2021.06.30 18:43
 */

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 封装的总查询结果类
 */
@Data
@TableName("def_result2021")
public class ResultVo implements Serializable {

    @TableId("number")
    private String number;                  // 学号

    /* page2, page3, page11 */
    private int educationalSystem;          // 在校时间， 两年，三年，四年等

    /* page3 */
    private String name;                    // 姓名

    /* page4 */
    private String enrollmentYear;          // 入学日期

    /* page5 */
    private String campus;      // 校区名称，长安校区，太白校区等
    private String apartment;   // 公寓楼号， 2号楼，等等
    private String dormitory;   // 宿舍号
    private String bed;         // 床位号
    private int roommates;      // 宿舍人数
    private String major;       // 专业名称

    /* page7 */
    private String firstToCanteen;      // 第一次进食堂时间
    private String firstPos;            // 第一次进食堂位置
    private double firstCost;           // 第一次消费金额
    private String firstMeal;           // 第一次吃的饭
    private int totalTimesCanteen;      // 进食堂的次数
    private String favoriteMeal;        // 最喜欢的菜
    private int favoriteMealTimes;      // 最喜欢的菜吃的次数

    /* page8 */
    private String firstToLibrary;      // 第一次进图书馆的时间
    private int totalTimesLibrary;      // 进图书馆的次数
    private int totalLoan;              // 借书的本数
    private String bookName;            // 最长时间借阅的书名
    private int exceeds;                // 借阅图书本书超越的人数百分比

    /* page9 */
    private String firstCourseTime;     // 第一门课的上课日期
    private String firstCourseName;     // 第一门课的课程名称
    private int totalCourses;           // 总上课门数
    private int totalCredit;            // 总学分数
    private int totalClassHours;        // 上课总时长

    /* page10 */
    // private List<String> locations;     // 疫情期间打卡地点
    private int gymTimes;               // 预约体育馆的次数, 彩虹体育馆数据，北校区不展示

    /* page11 */
    // private List<Reward> rewards;       // 获得的奖项

}
