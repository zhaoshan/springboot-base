package com.example.demo;

import com.example.demo.filter.TimeFilter;
import com.example.demo.listener.ListenerTest;
import com.example.demo.servlet.ServletTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;

import javax.servlet.DispatcherType;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.EnumSet;

/**
 * Created by zhaoshan on 2018/5/1.
 */
@SpringBootApplication
public class SpringbootWebApplication implements ServletContextInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        // 配置 Servlet
        servletContext.addServlet("servletTest",new ServletTest())
                .addMapping("/servletTest");
        // 配置过滤器
        servletContext.addFilter("timeFilter",new TimeFilter())
                .addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST),true,"/*");
        // 配置监听器
        servletContext.addListener(new ListenerTest());
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebApplication.class, args);
    }
}
