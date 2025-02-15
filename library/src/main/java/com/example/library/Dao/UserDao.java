package com.example.library.Dao;

import org.springframework.stereotype.Component;

import com.example.library.Model.User;

@Component
public interface UserDao {
    Integer createUser(User user);
    Boolean loginUser(User user);
}
