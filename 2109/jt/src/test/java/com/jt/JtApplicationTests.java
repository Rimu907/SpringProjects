package com.jt;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.jt.mapper.UserMapper;
import com.jt.pojo.User;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StringUtils;

import java.sql.Date;
import java.sql.Wrapper;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class JtApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {
        User user = new User();
        user.setUsername("admin888")
                .setPassword("123456")
                .setEmail("11@qq.com")
                .setPhone("18211938355")
                .setStatus(true);
        int rows = userMapper.insert(user);
        System.out.println("影响的行数:"+rows);
    }
    /**
     * 案例1: 根据ID进行查询
     * */
    @Test
    public void test01(){
        int id = 1;
        User user = userMapper.selectById(id);
        System.out.println(user);
    }

    @Test
    public void test02(){
        int id = 48;
        QueryWrapper<User> sectionQueryWrapper = new QueryWrapper<>();
        sectionQueryWrapper.eq("id", id);
        userMapper.delete(sectionQueryWrapper);
    }
    @Test
    public void test03(){
        QueryWrapper<User> Wrapper1 = new QueryWrapper<>();
        Wrapper1.eq("username", "admin123");
        User user = userMapper.selectOne(Wrapper1);
        System.out.println(user);

        //User user = userMapper.selectOne(null);
        QueryWrapper<User> Wrapper = new QueryWrapper<>();
        Wrapper.like("username", "admin");
        List<User> users = userMapper.selectList(Wrapper);
        System.out.println(users);
    }

    @Test
    public void test4(){
        QueryWrapper<User> Wrapper = new QueryWrapper<>();
        Wrapper.gt("id", 5);
        List<User> users = userMapper.selectList(Wrapper);
        for(User user : users){
            System.out.println(user);
        }
    }

    @Test
    public void test05(){
        //User user = userMapper.selectOne(null);
        QueryWrapper<User> Wrapper = new QueryWrapper<>();
        Wrapper.like("username", "admin").orderByDesc("id");
        List<User> users = userMapper.selectList(Wrapper);
        for(User user : users){
            System.out.println(user);
        }
    }

    @Test
    public void test06(){
        //User user = userMapper.selectOne(null);
        Integer[] ids = {1,2,23,24};
        QueryWrapper<User> Wrapper = new QueryWrapper<>();
        Wrapper.in("id", ids);
        List<User> users = userMapper.selectList(Wrapper);
        System.out.println(users);

        List list1 = Arrays.asList(ids);
        List<User> users1 = userMapper.selectBatchIds(list1);
        System.out.println(users1);
    }
    @Test
    public void test07(){
        String phone = "13111112222";
        String email = "";
        QueryWrapper<User> queryWrapper = new QueryWrapper();
        queryWrapper.eq(StringUtils.hasLength(phone),"phone", phone)
                .eq(StringUtils.hasLength(email),"email",email);
        List<User> list = userMapper.selectList(queryWrapper);
        System.out.println(list);
    }

    @Test
    public void test08(){
        User user = new User();
        user.setId(27).setUsername("admin110").setPhone("110110");
        userMapper.updateById(user);
        System.out.println("更新成功");

    }

    @Test
    public void test09(){
        User user = new User();
        user.setPhone("10086").setEmail("10086@qq.com");
        UpdateWrapper<User> UpdateWrapper = new UpdateWrapper<>();
        UpdateWrapper.eq("id", "51");
        userMapper.update(user, UpdateWrapper );
    }

}
