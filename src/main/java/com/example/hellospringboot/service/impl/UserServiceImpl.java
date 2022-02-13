package com.example.hellospringboot.service.impl;

import com.example.hellospringboot.entity.User;
import com.example.hellospringboot.mapper.UserMapper;
import com.example.hellospringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryUserByUserid(int userId){
        return userMapper.queryUserByUserid(userId);
    }

    public User queryUserByUsername(String username){
        return userMapper.queryUserByUsername(username);
    }

    public int isExist(String username){
        return userMapper.queryUserByUsername(username)!=null ? 1 : 0;
    }

    public List<User> queryAllUser(){
        return userMapper.queryAllUser();
    }

    public int addUser(User user){
        return userMapper.addUser(user);
    }

    public int delUser(int userId){
        return userMapper.delUser(userId);
    }

    public int updateUser(User user){
        return userMapper.updateUser(user);
    }
}
