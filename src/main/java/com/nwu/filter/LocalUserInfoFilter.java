package com.nwu.filter;

import com.nwu.util.CASUtil;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author Rex Joush
 * @time 2021.06.23 20:31
 */

public class LocalUserInfoFilter /*implements Filter*/ {


    //@Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    //@Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request_ = (HttpServletRequest) request;
        String loginName = CASUtil.getAccountNameFromCas(request_);
        if (!"".equals(loginName)) {
            System.out.println("访问者 ：" + loginName);
            request_.getSession().setAttribute("loginName", loginName);
        }

        chain.doFilter(request, response);
    }

    //@Override
    public void destroy() {

    }
}
