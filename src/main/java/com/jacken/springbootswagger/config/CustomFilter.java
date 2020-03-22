package com.jacken.springbootswagger.config;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author wangqiang
 * @version 1.0
 * @date 2020/3/21 17:04
 */
@WebFilter
@Slf4j
public class CustomFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("customFilter  处理请求之前");
        filterChain.doFilter(servletRequest,servletResponse);
        log.info("ustomFilter  处理请求之前");
    }

    @Override
    public void destroy() {
        log.info("过滤器销毁");
    }
}
