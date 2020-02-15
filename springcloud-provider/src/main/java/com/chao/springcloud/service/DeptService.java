package com.chao.springcloud.service;

import com.chao.springcloud.pojo.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept queryByDeptNo(Long deptNo);

    public List<Dept> queryAll();
}
