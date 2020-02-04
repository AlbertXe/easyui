package com.easyui.controller;

import com.easyui.dao.UserDao;
import com.easyui.pojo.User;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserDao userDao;

    @RequestMapping("/userController/list")
    @ResponseBody
    public List<User> listUser(int page,int rows) {
        PageHelper.startPage(page, rows);
        List<User> users = userDao.getUsers();
        System.out.println(users.size());
        return users;
    }


}
