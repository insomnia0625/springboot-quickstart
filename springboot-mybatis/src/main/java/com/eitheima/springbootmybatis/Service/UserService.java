package com.eitheima.springbootmybatis.Service;

import com.eitheima.springbootmybatis.Entity.User;

public interface UserService {

    public User findById(Integer id);
}
