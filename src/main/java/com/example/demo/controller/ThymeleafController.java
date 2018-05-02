package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by zhaoshan on 2018/5/1.
 */
@Controller
@RequestMapping("thymeleaf")
public class ThymeleafController {

    @RequestMapping("hello")
    public String hello(Map<String,Object> map) {
        map.put("msg", "Hello Thymeleaf");
        return "hello";
    }

    @RequestMapping("cros")
    public String crosTest(Map<String,Object> map) {
        map.put("msg", "Hello Thymeleaf");
        return "cros";
    }
}