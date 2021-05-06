package com.yj.ems.dao;

import com.yj.ems.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface UserDao {
    void save(User user);

    User login(@Param("username") String pusername,@Param("password") String password);
}
