package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhaoshan on 2018/4/28.
 */
@RestController
public class TestController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("hw")
    public String helloworld() {
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");

        return "====helloworld====";
    }

}
