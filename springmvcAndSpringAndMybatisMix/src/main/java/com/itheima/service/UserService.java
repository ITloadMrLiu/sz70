package com.itheima.service;

import com.itheima.domain.User;

import java.util.List;

public interface UserService {
    int addUser(User user);

    int deleteUserById(int id);

    int updateUser(User user);

    User findUserById(int id);

    List<User> findAll();

    User findAccountByUserId(int id);
}
