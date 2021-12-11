package com.jt.service;

import com.jt.mapper.UserMapper;
import com.jt.pojo.User;
import com.jt.vo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service

public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    /**
     * 思路:
     *      1.将密码明文,转化为密文  sha1/md5算法/md5hash
     *      2.根据用户名和密码查询用户信息
     *      3.有结果:返回token
     *      4.无结果:返回null
     * @return
     */

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }


    @Transactional
    @Override
    public void register(User user){
        String password = user.getPassword();
        String md5password= DigestUtils.md5DigestAsHex(password.getBytes());
        user.setPassword(md5password);
        User userByUP = userMapper.findUserByUP(user);
        if (userByUP != null){
            return;
        }
        user.setCreated(new Date());
        user.setUpdated(new Date());
        userMapper.insertUser(user);
    }

    @Override
    public String login(User user) {
        String password = user.getPassword();
        byte[] bytes = password.getBytes();
        //密码加密
        String md5password= DigestUtils.md5DigestAsHex(bytes);
        user.setPassword(md5password);
        //根据用户名和密码查询数据库
        User userDB = userMapper.findUserByUP(user);
        //判断userDB是否有值
        if (userDB == null){
            //用户名密码错误
            return null;
        }
        //用户名密码正确
        String token = UUID.randomUUID().toString();
        return token;
    }

    @Override
    public PageResult findUserList(PageResult pageResult) {

        long total = userMapper.findTotal();
        int start = (pageResult.getPageNum()-1)*(pageResult.getPageSize());
        int size = pageResult.getPageSize();
        String query = pageResult.getQuery();
        List<User> rows = userMapper.findUserList(start,size,query);

        pageResult.setTotal(total);
        pageResult.setRows(rows);

        return pageResult;
    }

    @Transactional
    @Override
    public void updateUserStatus(User user) {
        user.setUpdated(new Date());
        userMapper.updateUserStatus(user);
    }

    @Transactional
    @Override
    public void deleteUser(User user) {
        userMapper.deleteUser(user);
    }

    @Transactional
    @Override
    public void modifyUser(User user) {
        user.setUpdated(new Date());
        userMapper.modifyUser(user);
    }

    @Override
    public User getUser(User user) {
        User user1 = userMapper.getUser(user);
        return user1;
    }


}
