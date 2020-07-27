package com.itheima.user.service;

import com.itheima.user.mapper.UserMapper;
import com.itheima.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author kpwang
 * @create 2020-07-27 20:59
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User queryById(Long id){
        return userMapper.selectByPrimaryKey(id);
    }
}
