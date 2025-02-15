package com.example.library.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.library.Dao.UserDao;
import com.example.library.Model.User;
import com.example.library.Service.UserService;

@Component
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public Integer createUser(User user) {
        return userDao.createUser(user);
    }
}
