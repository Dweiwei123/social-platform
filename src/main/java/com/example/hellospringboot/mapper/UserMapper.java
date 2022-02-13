package com.example.hellospringboot.mapper;

import com.example.hellospringboot.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//mybatis的mapper类：Dao
//需要用到sql语句的方法
@Mapper
@Repository
public interface UserMapper {

    User queryUserByUserid(int userId);

    User queryUserByUsername(String username);

    List<User> queryAllUser();

    int addUser(User user);

    int delUser(int userId);

    int updateUser(User user);

}
