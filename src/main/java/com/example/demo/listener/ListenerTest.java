package com.example.demo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by zhaoshan on 2018/5/1.
 */
public class ListenerTest implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("监听器初始化...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
