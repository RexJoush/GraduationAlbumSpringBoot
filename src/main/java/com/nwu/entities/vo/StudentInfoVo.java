package com.nwu.entities.vo;

/**
 * @author Rex Joush
 * @time 2021.06.16 19:45
 */

import com.nwu.entities.Reward;
import lombok.Data;

import java.util.List;

/**
 * 查询的结果封装类
 */
@Data
public class StudentInfoVo {

    private String number;                  // 学号

    /* page2, page11 */
    private String studentType;             // 学生类型，博士硕士学士，需要换算对应时间，两年，三年，四年等

    /* page3 */
    private String name;                    // 姓名

    /* page4 */
    private String departmentName;          // 入学日期

    /* page5 */
    private String campus;      // 校区名称，长安校区，太白校区等
    private String apartment;   // 公寓楼号， 2号楼，等等
    private String dormitory;   // 宿舍号
    private String bed;         // 床位号
    // private int roommates;   // 宿舍人数
    private String major;       // 专业名称

    /* page7 */
    private String firstToCanteen;      // 第一次进食堂时间
    private String firstPos;            // 第一次进食堂位置
    private double firstCost;           // 第一次消费金额
    private String firstMeal;           // 第一次吃的饭
    private int totalTimesCanteen;      // 进食堂的次数
    private String favoriteMeal;        // 最喜欢的菜
    private String favoriteMealTimes;   // 最喜欢的菜吃的次数

    /* page8 */
    private String firstToLibrary;      // 第一次进图书馆的时间
    private int totalTimesLibrary;      // 进图书馆的次数
    private int totalLoan;              // 借书的本数
    private String bookName;            // 最长时间借阅的书名

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
