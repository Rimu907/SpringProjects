package com.jt.mapper;

import com.jt.pojo.User;
import com.jt.vo.PageResult;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper {

    List<User> findAll();


    void insertUser(User user);

    User findUserByUP(User user);

    PageResult findUserList(PageResult pageResult);

    @Select("select count(1) from user")
    long findTotal();


    List<User> findUserList(@Param("start") int start, @Param("size") int size, @Param("query") String query);

    @Select("select status from user where id = #{id}")
    int findUserById(Integer id);

    @Update("update user set status = #{status}, updated = #{updated} where id = #{id}")
    void updateUserStatus(User user);

    @Delete("delete from user where id = #{id}")
    void deleteUser(User user);

    @Update("update user set phone = #{phone}, email = #{email}, updated = #{updated} where id = #{id}")
    void modifyUser(User user);

    @Select("select * from user where id = #{id}")
    User getUser(User user);
}
