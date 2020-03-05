package com.chao.springcloud.controller;

import com.chao.springcloud.mapper.DeptMapper;
import com.chao.springcloud.pojo.Dept;
import com.chao.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class DeptController {
    @Autowired
    private DeptService deptService;

    @PostMapping("/dept/add")
    public boolean addDept(Dept dept) {
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/queryByDeptNo/{deptNo}")
    public Dept queryByDeptNo(@PathVariable("deptNo") Long deptNo) {
        return deptService.queryByDeptNo(deptNo);
    }

    @GetMapping("/dept/queryAll")
    public List<Dept> queryAll() {
        return deptService.queryAll();
    }
}
