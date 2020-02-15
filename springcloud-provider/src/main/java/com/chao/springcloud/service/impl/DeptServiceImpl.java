package com.chao.springcloud.service.impl;

import com.chao.springcloud.mapper.DeptMapper;
import com.chao.springcloud.pojo.Dept;
import com.chao.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public boolean addDept(Dept dept) {
        return deptMapper.addDept(dept);
    }

    @Override
    public Dept queryByDeptNo(Long deptNo) {
        return deptMapper.queryByDeptNo(deptNo);
    }

    @Override
    public List<Dept> queryAll() {
        return deptMapper.queryAll();
    }
}
