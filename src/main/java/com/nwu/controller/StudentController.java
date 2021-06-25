package com.nwu.controller;

import com.nwu.entities.StudentInfo;
import com.nwu.service.StudentService;
import com.nwu.util.CASUtil;
import com.nwu.util.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author Rex Joush
 * @time 2021.06.16 19:41
 */

@RestController
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;

    @GetMapping("/getStudentInfo")
    public String getStudentInfo(HttpServletRequest request){

        String number = CASUtil.getAccountNameFromCas(request);
        System.out.println("info " + number);

        if (!"".equals(number)) {
//            System.out.println("访问者 ：" + loginName);

            request.getSession().setAttribute("number", number);
            StudentInfo studentInfo = studentService.getStudentInfo(number);

            return Result.ok("获取学生信息成功", studentInfo);

//            result.put("code", 1200);
//            result.put("message", "获取学生信息成功");
//            result.put("data", studentInfo);

        } else {
            return Result.error("获取学生信息失败");
//            result.put("code", 1400);
//            result.put("message", "获取学生信息失败");
        }


        // 获取学生所有信息
//        if (number != null) {
//            StudentInfo studentInfo = studentService.getStudentInfo(number);
//            result.put("code", 1200);
//            result.put("message", "获取学生信息成功");
//            result.put("data", studentInfo);
//        } else {
//            result.put("code", 1400);
//            result.put("message", "获取学生信息失败");
//        }

        // return JSON.toJSONString(result);

    }

}
