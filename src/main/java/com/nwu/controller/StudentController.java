package com.nwu.controller;

import com.alibaba.fastjson.JSON;
import com.nwu.entities.StudentInfo;
import com.nwu.service.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

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
    public String getStudentInfo(@RequestParam("number") String number){

        Map<String, Object> result = new HashMap<>();

        // 获取学生所有信息
        if (number != null) {
            StudentInfo studentInfo = studentService.getStudentInfo(number);
            result.put("code", 1200);
            result.put("message", "获取学生信息成功");
            result.put("data", studentInfo);
        } else {
            result.put("code", 1400);
            result.put("message", "获取学生信息失败");
        }

        return JSON.toJSONString(result);

    }

}
