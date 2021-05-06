package com.yj.ems.service;

import com.yj.ems.entity.User;

public interface UserService {
    void register(User user);
    User login(String username,String password);
}
