package com.nwu.controller;

/**
 * @author Rex Joush
 * @time 2021.06.05 15:58
 */

import com.nwu.entities.Student;
import com.nwu.service.UserService;
import com.nwu.util.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 测试接口，后期不需要
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/user")
    public String getUsers(){

        // 查询所有用户
        List<Student> students = userService.list();

        // 返回结果
        return Result.ok("获取用户列表成功", students);
    }

    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable("id") int id){

        // 根据 id 查询用户
        Student student = userService.getById(id);

        // 返回结果
        if (student != null){
            return Result.ok("获取用户成功", student);
        } else {
            return Result.error("此用户不存在");
        }
    }

    @PostMapping("/user")
    public String saveUser(@RequestBody Student student){

        if (userService.save(student)) {
            return Result.ok("添加用户成功");
        } else {
            return Result.error("添加用户失败");
        }
    }

    @PutMapping("/user")
    public String updateUser(@RequestBody Student student){

        if (userService.updateById(student)) {
            return Result.ok("修改户成功");
        } else {
            return Result.error("修改用户失败");
        }
    }

    @DeleteMapping("/user/{id}")
    public String deleteUserById(@PathVariable("id") int id){

        if (userService.removeById(id)){
            return Result.ok("删除用户成功");
        } else {
            return Result.error("删除用户失败");
        }

    }

}
