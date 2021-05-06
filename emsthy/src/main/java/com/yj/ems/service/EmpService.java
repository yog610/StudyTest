package com.yj.ems.service;

import com.yj.ems.entity.Emp;
import com.yj.ems.entity.User;

import java.util.List;

public interface EmpService {
    List<Emp> findall();
    void save(Emp emp);

}
