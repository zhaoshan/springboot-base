package com.example.demo.dao;

import com.example.demo.entity.User;

/**
 * Created by zhaoshan on 2018/5/1.
 */
public interface UserDao {

    public int insert(User user);

    public int deleteById(Integer id);

    public int update(User user);

    public User getById(Integer id);
}