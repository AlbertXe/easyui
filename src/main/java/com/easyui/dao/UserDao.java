package com.easyui.dao;

import com.easyui.pojo.User;
import org.apache.ibatis.annotations.Delete;
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

    //    @Insert("insert into user (`id`, `name`, `password`, `update_time`, `create_time`) values( ${id},${name},${password},${createTime),${updateTime})")
    @Insert("INSERT INTO `study`.`user`(`id`, `name`, `password`, `update_time`, `create_time`) VALUES (#{id}, #{name}, #{password}, #{createTime}, #{updateTime});")
    void insert(User user);

    @Delete("delete from user where id = #{id}")
    void deleteUser(String id);
}
