package com.easyui.controller;

import com.easyui.dao.MenuDao;
import com.easyui.pojo.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MenuController {
    @Autowired
    MenuDao menuDao;

    @RequestMapping(value = "/menu")
    @ResponseBody
    public Menu[] menu(Menu menu) {
        List<Menu> menus = menuDao.selectMenu(menu);
        System.out.println(menus);
        Menu[] ss = new Menu[menus.size()];
        menus.toArray(ss);
        return ss;
    }
}
