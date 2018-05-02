package com.example.demo.dao;

import com.example.demo.BootbaseApplication;
import com.example.demo.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * Created by zhaoshan on 2018/5/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootbaseApplication.class)
public class UserDaoTest {

    @Autowired
    private UserDao userDao;


    @Test
    public void testInsert() {
        User user = new User();
        user.setId(1);
        user.setUsername("张三");
        user.setPassword("zhangsan");
        user.setBirthday(new Date());

        int result = this.userDao.insert(user);
        System.out.println(result);
    }

    @Test
    public void testGetById() {
        User user = this.userDao.getById(1);
        System.out.println(user.getUsername());
    }

    @Test
    public void testUpdate() {
        User user = new User();
        user.setId(1);
        user.setPassword("zhangsan123");
        this.userDao.update(user);
    }

    @Test
    public void testDeleteById() {
        int result = this.userDao.deleteById(1);
        System.out.println(result);
    }
}
