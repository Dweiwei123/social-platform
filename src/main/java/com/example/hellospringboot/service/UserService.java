package com.example.hellospringboot.service;

import com.example.hellospringboot.entity.User;

import java.util.List;

public interface UserService {

    User queryUserByUserid(int userId);

    User queryUserByUsername(String username);

    int isExist(String username);

    List<User> queryAllUser();

    int addUser(User user);

    int delUser(int userId);

    int updateUser(User user);
}
