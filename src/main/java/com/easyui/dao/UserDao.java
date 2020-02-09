package com.easyui.dao;

import com.easyui.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface UserDao {
//    @Select("select * from user")
//    List<User> getUsers();
//    @Select("select * from user ${orderBy} limit #{start},#{pageSize}")
//    List<User> getUsersOrderBy(@Param("start")int start,@Param("pageSize")int pageSize,@Param("orderBy") String orderBy);

    List<User> getUserByExample(User user);

    Integer getCountByExample(User user);

    @Insert("insert into user values(${id},${name},${password},${createTime),${updateTime}")
    void insert(User user);
}
