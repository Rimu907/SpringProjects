package com.jt.mapper;

import com.jt.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Date:2021/12/3 15:27
 * @Author:NANDI_GUO
 */

@Mapper
public interface UserMapper {
    List<User> findAll();

    User findUserById(int id);

    List<User> findByName(User user);

    List<User> findByAge(Map<String,Integer> map);

    List<User> findUserByAge2(@Param("as") int minAge, @Param("ae") int maxAge);

    List<User> findUserByWord(String word);

    List<User> findListByIn(int[] array);

    void saveUser(User user);

    List<User> findR(User user);
}
