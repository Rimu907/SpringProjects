package com.jt.mapper;

import com.jt.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Date:2021/12/7 9:43
 * @Author:NANDI_GUO
 */

@Mapper
public interface UserMapper2 {
   List<User> findUserList(User user);

    void updateUser(User user);
}
