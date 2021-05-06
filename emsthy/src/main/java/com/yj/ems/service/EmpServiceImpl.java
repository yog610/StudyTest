package com.yj.ems.service;

import com.yj.ems.dao.EmpDao;
import com.yj.ems.dao.UserDao;
import com.yj.ems.entity.Emp;
import com.yj.ems.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class EmpServiceImpl implements  EmpService {

    @Autowired
    private EmpDao empDao;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Emp> findall() {
        return empDao.findall();
    }

    @Override
    public void save(Emp emp) {
        emp.setId(UUID.randomUUID().toString());
        empDao.save(emp);
    }
}

