package com.jt.mapper;


import com.jt.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Date:2021/12/8 9:35
 * @Author:NANDI_GUO
 */
@Mapper
@CacheNamespace
public interface UserAnnoMapper {
    @Select("select * from demo_user")
    List<User> findAll();

    @Select("select * from demo_user where id = #{id}")
    User findId(int id);



    @Insert("insert into demo_user values(null,#{name},#{age},#{sex})")
    void insertUser(User user);

    @Delete("delete from demo_user where id = #{id}")
    void delUser(int id);

    List<User> findCache();
}
