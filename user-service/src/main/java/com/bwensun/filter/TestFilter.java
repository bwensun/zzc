package com.bwensun.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author 郑建雄
 * @program film
 * @description
 * @date 2019/4/10
 */
//@WebFilter(urlPatterns = "/*", filterName = "testFilter")
public class TestFilter implements Filter {



    @Override
    public void init(javax.servlet.FilterConfig filterConfig) throws ServletException {
        //logger.info("==========初始化过滤器=============");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String addRequestHeader = request.getHeader("X-Request-Foo");
        System.out.println("X-Request-Foo" + "============>" +  addRequestHeader);
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        //logger.info("==========销毁过滤器=============");
    }
}
