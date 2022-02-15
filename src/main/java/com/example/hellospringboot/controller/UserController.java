package com.example.hellospringboot.controller;

import com.example.hellospringboot.entity.User;
import com.example.hellospringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@CrossOrigin
//@RestController @ResponseBody结合体 无法返回页面 而是数据
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"/", "/index.html"})
    public String index() {
        return "sign-in";
    }

    @ResponseBody //return不会再解析为跳转路径 而是数据
    @RequestMapping("/byq")
    public List<User> hi() {
        List<User> userList = userService.queryAllUser();
        for (User user:userList) {
            System.out.println(user);
        }
        return userList;
    }

    @ResponseBody
    @RequestMapping("/lhf")
    public String hello(String username, HttpServletRequest request) {
        //类似JSP中request.setAttribute()
        User user = new User();
        user.setUsername("dweiwei");
        request.getSession().setAttribute("username",username);
        return "Hello," + request.getSession().getAttribute("username") + "!";
    }

    @ResponseBody //return不会再解析为跳转路径 而是数据
    @RequestMapping("/login")
    public int login(String username,String password) {
        if(userService.isExist(username) == 1 && userService.queryUserByUsername(username).getPassword().equals(password)){
            System.out.println("username = " + username + ", password = " + password + " 登陆成功！");
            return 1;
        }
        else{
            System.out.println("username = " + username + ", password = " + password + " 登陆失败！");
            return 0;
        }
    }

    @ResponseBody
    @RequestMapping("/register")
    public int register(@RequestBody User user) {
        if(userService.isExist(user.getUsername()) != 1 && userService.addUser(user) == 1){
            System.out.println("username = " + user.getUsername() + " 注册成功！");
            return 1;
        }
        else{
            System.out.println("username = " + user.getUsername() + " 注册失败！");
            return 0;
        }
    }
}