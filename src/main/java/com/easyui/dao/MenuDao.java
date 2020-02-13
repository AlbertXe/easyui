package com.easyui.dao;

import com.easyui.pojo.Menu;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MenuDao {
    List<Menu> selectMenu(Menu menu);
}
