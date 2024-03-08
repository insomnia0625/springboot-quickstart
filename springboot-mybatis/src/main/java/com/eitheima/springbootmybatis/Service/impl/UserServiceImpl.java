package com.eitheima.springbootmybatis.Service.impl;

import com.eitheima.springbootmybatis.Entity.User;
import com.eitheima.springbootmybatis.Mapper.UserMapper;
import com.eitheima.springbootmybatis.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }
}
