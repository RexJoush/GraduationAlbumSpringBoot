package com.nwu.controller;

import com.nwu.entities.GraduateUser;
import com.nwu.service.GraduateUserService;
import com.nwu.service.NumberService;
import com.nwu.util.CASUtil;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Rex Joush
 * @time 2021.06.23 19:43
 */

@Controller
public class IndexController {

    @Resource
    private NumberService numberService;

    @Resource
    private RedisTemplate<Object, Object> redisTemplate;

    @Resource
    private GraduateUserService graduateUserService;

    @RequestMapping("/")
    public void index(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String number = CASUtil.getAccountNameFromCas(request);
        ValueOperations<Object, Object> integerValueOperations = redisTemplate.opsForValue();

        System.out.println(number);

        if (numberService.getCheckNumbers().contains(number)) {
            response.sendRedirect("/check.html");
            return;
        }
        GraduateUser byId = graduateUserService.getById(number);
        System.out.println(byId);
        if (byId == null){
            // 非毕业生的访问
            integerValueOperations.increment("notStudentVisit");
            response.sendRedirect("/user.html");
        }
        else {
            // 本项目的访问量
             integerValueOperations.increment("indexVisit");
             response.sendRedirect("/index.html");
        }


    }

}
