package com.example.hellospringboot.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class User {
    private int userId;
    private String username;
    private String password;
    private int gender;
    private String email;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone="GMT+8")
    private Date birthday;

//    @Override //重写为json格式
//    public String toString() {
//        return  "{" +
//                "\"userId\":" + userId +
//                ", \"username\":\"" + username + '\"' +
//                ", \"password\":\"" + password + '\"' +
//                ", \"gender\":" + gender +
//                ", \"email\":\"" + email + '\"' +
//                ", \"birthday\":\"" + birthday + '\"' +
//                "}";
//    }
}
