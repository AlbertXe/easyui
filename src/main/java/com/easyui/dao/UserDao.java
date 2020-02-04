package com.easyui.dao;

import com.easyui.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface UserDao {
    @Select("select * from user")
    List<User> getUsers();

}
