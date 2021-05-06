package com.yj.ems.dao;

import com.yj.ems.entity.Emp;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmpDao {
    List<Emp> findall();
    //保存员工信息
    void save(Emp emp);

}
