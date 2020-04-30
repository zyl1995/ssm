package com.ssmdemo.zyl.filter;

import com.ssmdemo.zyl.entity.Student;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthRedirectFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        Student student = (Student)request.getSession().getAttribute("student");
        if (student != null) {
            //已登录，重定向
            HttpServletResponse response = (HttpServletResponse) servletResponse;
            response.sendRedirect("book");
        } else {
            //未登录，继续访问
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

    public void destroy() {

    }
}
