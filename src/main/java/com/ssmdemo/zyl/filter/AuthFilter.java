package com.ssmdemo.zyl.filter;

import com.ssmdemo.zyl.entity.Student;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class AuthFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        Student student = (Student)request.getSession().getAttribute("student");
        if (student != null) {
            // 已登录
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            // 统一定向到某个页面
            request.getRequestDispatcher("not_login.jsp").forward(servletRequest, servletResponse);
        }
    }

    public void destroy() {

    }
}
