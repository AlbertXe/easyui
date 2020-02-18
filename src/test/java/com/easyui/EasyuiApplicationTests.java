package com.easyui;

import com.easyui.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class EasyuiApplicationTests {
    @Autowired
    UserDao userDao;

    @Test
    void contextLoads() {
        List<String> strings = userDao.selName();
        System.out.println(strings);
    }

}
