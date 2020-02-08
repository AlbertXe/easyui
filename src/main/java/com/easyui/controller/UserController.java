package com.easyui.controller;

import com.easyui.dao.UserDao;
import com.easyui.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    UserDao userDao;

    @RequestMapping("/userController/list")
    @ResponseBody
    public Map<String, Object> listUser(User user) {
        int start = (user.getPage() -1)* user.getRows();
        user.setStart(start);
        System.out.println("sort:"+user.getSort());
        System.out.println("order:"+user.getOrder());
        String orderBy = "order by " + user.getSort() + " " + user.getOrder();
//        List<User> users = userDao.getUsersOrderBy(start,user.getRows(),orderBy);
        List<User> users = userDao.getUserByExample(user);
        System.out.println(users.size());

        Map<String,Object> map = new HashMap<>();
        //easyui 需要返回 total 和 total
        Integer count = userDao.getCountByExample(user);
        System.out.println("count=" + count);
        map.put("total", count);
        map.put("rows", users);
        return map;
    }


}
