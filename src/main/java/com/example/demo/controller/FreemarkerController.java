package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by zhaoshan on 2018/5/1.
 */
@Controller
@RequestMapping("freemarker")
public class FreemarkerController {

    @RequestMapping("hello")
    public String hello(Map<String,Object> map) {

        map.put("msg", "Hello Freemarker");
        return "hello";
    }
}
