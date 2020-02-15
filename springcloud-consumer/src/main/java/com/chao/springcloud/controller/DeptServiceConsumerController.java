package com.chao.springcloud.controller;

import com.chao.springcloud.pojo.Dept;
import com.chao.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptServiceConsumerController {
    @Autowired
    DeptClientService deptClientService;

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return deptClientService.addDept(dept);
    }

    @RequestMapping("/consumer/dept/queryByDeptNo/{deptNo}")
    public Dept get(@PathVariable("deptNo") Long deptNo){
        return deptClientService.queryByDeptNo(deptNo);
    }

    @RequestMapping("/consumer/dept/queryAll")
    public List<Dept> queryAll(){
        return deptClientService.queryAll();
    }
}
