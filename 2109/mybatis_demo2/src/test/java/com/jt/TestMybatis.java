package com.jt;

import com.jt.mapper.UserMapper;
import com.jt.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Date:2021/12/3 16:27
 * @Author:NANDI_GUO
 */

public class TestMybatis {
    /**
     * 规则模式
     * 1.
     * */
    @Test
    public void demo1() throws IOException {
        //1.1 指定配置文件的根目录
        String resource = "mybatis-config.xml";
        //通过Io流加载配置文件 org.apache.ibatis.io.Resources
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //实例化工厂对象对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取sqlsession 通过sqlsession可以直接操作数据库
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取接口对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //调用接口方法
        List<User> userList = userMapper.findAll();
        System.out.println(userList);
        //暂时手动关闭连接
        sqlSession.close();

    }
}
