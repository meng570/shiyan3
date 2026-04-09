package com.stu.helloserver.mapper;

import com.stu.helloserver.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("SELECT * FROM sys_user WHERE username = #{username}")
    User findByUsername(String username);

    @Insert("INSERT INTO sys_user(username,password) VALUES(#{username},#{password})")
    int insert(User user);
}