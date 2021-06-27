package com.nwu.controller;

import com.nwu.service.NumberService;
import com.nwu.util.CASUtil;
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

    @RequestMapping("/")
    public void index(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String number = CASUtil.getAccountNameFromCas(request);

        if (numberService.getCheckNumbers().contains(number)) {
            response.sendRedirect("https://www.rexjoush.com");
        } else {
            response.sendRedirect("/index.html");
        }


    }

}
