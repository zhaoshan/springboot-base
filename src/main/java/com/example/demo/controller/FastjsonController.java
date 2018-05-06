package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.Department;
import com.example.demo.entity.User;
import com.example.demo.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by zhaoshan on 2018/5/1.
 */
@Controller
@RequestMapping("fastjson")
public class FastjsonController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private DepartmentMapper departmentMapper;

    @RequestMapping("/test")
    @ResponseBody
    @CrossOrigin(origins="http://localhost:8088")//跨域控制方法
    public User test() {
        User user = new User();

        //user.setId(1);
        user.setUsername("jack");
        user.setPassword("jack123");
        user.setBirthday(new Date());

//        int result = this.userDao.insert(user);
//        System.out.println(result);

        Department department = new Department();
        department.setId(1);
        department.setName("65767");
        department.setDescr("99878879");
        this.departmentMapper.insert(department);

        return user;
    }
}
