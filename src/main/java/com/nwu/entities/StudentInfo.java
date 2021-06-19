package com.nwu.entities;

import com.nwu.entities.page.*;
import lombok.Data;

/**
 * @author Rex Joush
 * @time 2021.06.16 19:39
 */

/**
 * 要展示的学生信息
 */
@Data
public class StudentInfo {

    private String number;  // 学号

    /*  每页要展示的具体信息  */
    private Page1 page1;
    private Page2 page2;
    private Page3 page3;
    private Page4 page4;
    private Page5 page5;
    private Page6 page6;
    private Page7 page7;
    private Page8 page8;
    private Page9 page9;
    private Page10 page10;
    private Page11 page11;
    private Page12 page12;

}
