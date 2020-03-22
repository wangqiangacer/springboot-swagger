package com.jacken.springbootswagger.config;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * @author wangqiang
 * @version 1.0
 * @date 2020/3/21 16:55
 */
@Slf4j
@WebListener
public class CuntomerListener implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        log.info("监听器销毁");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        log.info("监听器初始化 可以记录访问次数哦");
    }
}
