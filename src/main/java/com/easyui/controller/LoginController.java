package com.easyui.controller;

import com.easyui.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    @RequestMapping("/loginController")
    @ResponseBody
    public String login(HttpServletRequest request,User user) {

        System.out.println(user);

        return user.toString();
    }
    @RequestMapping("/regController")
    @ResponseBody
    public String reg(HttpServletRequest request,User user) {

        System.out.println(user);

        return user.toString();
    }
}
