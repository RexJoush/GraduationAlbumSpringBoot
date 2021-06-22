package com.nwu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.nwu.entities.Reward;
import com.nwu.entities.StudentInfo;
import com.nwu.entities.page.*;
import com.nwu.entities.vo.StudentInfoVo;
import com.nwu.mapper.StudentInfoMapper;
import com.nwu.mapper.StudentMapper;
import com.nwu.service.BulletService;
import com.nwu.service.RewardService;
import com.nwu.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.List;

/**
 * @author Rex Joush
 * @time 2021.06.16 19:42
 */

/**
 * 获取所有信息
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentInfoMapper infoMapper;

    @Resource
    private RewardService rewardService;

    @Resource
    private StudentMapper studentMapper;

    @Resource
    private BulletService bulletService;

    @Override
    public StudentInfo getStudentInfo(String number) {

        StudentInfoVo studentInfoVo = infoMapper.getStudentInfo(number);

        /*
        StudentInfoVo(
            number=202032978, studentType=硕士,
            name=李一航, departmentName=网络与数据中心, campus=长安校区,
            apartment=博硕西楼, dormitory=513, bed=2, major=软件工程,

            firstToCanteen=2020-09-03, firstPos=1000078, firstCost=20.05,
            firstMeal=麦香饼、煎饼果子, totalTimesCanteen=500,
            favoriteMeal=蒸菜, favoriteMealTimes=102,

            firstToLibrary=2020-10-20, totalTimesLibrary=10,
            totalLoan=30, bookName=Java程序设计,

            firstCourseTime=2020-09-11, firstCourseName=网络安全,
            totalCourses=70, totalCredit=170, totalClassHours=1460
        )

         */
        //System.out.println(studentInfoVo);



        // 结果对象
        StudentInfo studentInfo = new StudentInfo();

        // 分页对象
        Page1 page1 = new Page1();
        Page2 page2 = new Page2();
        Page3 page3 = new Page3();
        Page4 page4 = new Page4();
        Page5 page5 = new Page5();
        Page6 page6 = new Page6();
        Page7 page7 = new Page7();
        Page8 page8 = new Page8();
        Page9 page9 = new Page9();
        Page10 page10 = new Page10();
        Page11 page11 = new Page11();
        Page12 page12 = new Page12();

        String educationalSystem = String.valueOf(Calendar.getInstance().get(Calendar.YEAR) - Integer.parseInt(number.substring(0, 4)));


        // 封装学号
        studentInfo.setNumber(studentInfoVo.getNumber());

        // 封装第 1 页
        studentInfo.setPage1(page1);

        // 封装第 2 页
        page2.setEducationalSystem(educationalSystem);
        studentInfo.setPage2(page2);

        // 封装第 3 页
        page3.setEducationalSystem(educationalSystem);
        studentInfo.setPage3(page3);

        // 封装第 4 页
        page4.setName(studentInfoVo.getName());
        studentInfo.setPage4(page4);

        // 封装第 5 页
        page5.setEnrollmentYear("2020-09-03");
        studentInfo.setPage5(page5);

        // 封装第 6 页
        page6.setCampus(studentInfoVo.getCampus());
        page6.setApartment(studentInfoVo.getApartment());
        page6.setDormitory(studentInfoVo.getDormitory());
        page6.setBed(studentInfoVo.getBed());
        page6.setRoommates(3);
        page6.setMajor(studentInfoVo.getMajor());
        studentInfo.setPage6(page6);

        // 封装第 7 页
        page7.setFirstToCanteen(studentInfoVo.getFirstToCanteen());
        page7.setFirstPos(studentInfoVo.getFirstPos());
        page7.setFirstCost(studentInfoVo.getFirstCost());
        page7.setFirstMeal(studentInfoVo.getFirstMeal());
        page7.setTotalTimesCanteen(studentInfoVo.getTotalTimesCanteen());
        page7.setFavoriteMeal(studentInfoVo.getFavoriteMeal());
        page7.setFavoriteMealTimes(studentInfoVo.getFavoriteMealTimes());
        studentInfo.setPage7(page7);

        // 封装第 8 页
        page8.setFirstToLibrary(studentInfoVo.getFirstToLibrary());
        page8.setTotalTimesLibrary(studentInfoVo.getTotalTimesLibrary());
        page8.setTotalLoan(studentInfoVo.getTotalLoan());
        page8.setBookName(studentInfoVo.getBookName());
        page8.setExceeds(56);
        studentInfo.setPage8(page8);

        // 封装第 9 页
        page9.setFirstCourseTime(studentInfoVo.getFirstCourseTime());
        page9.setFirstCourseName(studentInfoVo.getFirstCourseName());
        page9.setTotalCourses(studentInfoVo.getTotalCourses());
        page9.setTotalCredit(studentInfoVo.getTotalCredit());
        page9.setTotalClassHours(studentInfoVo.getTotalClassHours());
        studentInfo.setPage9(page9);

        // 封装第 10 页
        page10.setGymTimes(10);
        studentInfo.setPage10(page10);

        // 封装第 11 页
        QueryWrapper<Reward> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("number", studentInfoVo.getNumber());
        List<Reward> rewards = rewardService.list(queryWrapper);

        page11.setEducationalSystem(educationalSystem);
        page11.setRewards(rewards);
        studentInfo.setPage11(page11);

        // 封装第 12 页
        studentInfo.setPage12(page12);

        // 封装弹幕列表
        studentInfo.setBullets(bulletService.getBullets());

        return studentInfo;
    }

    @Override
    public String getStudentName(String number) {
        return studentMapper.getStudentName(number);
    }
}
