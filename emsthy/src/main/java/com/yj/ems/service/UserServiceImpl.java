package com.yj.ems.service;

import com.yj.ems.dao.UserDao;
import com.yj.ems.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class UserServiceImpl implements  UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public void register(User user) {
        user.setId(UUID.randomUUID().toString());
        userDao.save(user);

    }

    @Override
    public User login(String username, String password) {
        return userDao.login(username,password);
    }
}
