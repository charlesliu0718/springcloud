package com.chao.springcloud.service;

import com.chao.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Component
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT")
public interface DeptClientService {

    @GetMapping("/dept/queryByDeptNo/{deptNo}")
    public abstract Dept queryByDeptNo(@PathVariable("deptNo") Long deptNo);

    @GetMapping("/dept/queryAll")
    public abstract List<Dept> queryAll();

    @PostMapping("/dept/add")
    public abstract boolean addDept(Dept dept);

}
