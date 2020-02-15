package com.chao.springcloud.mapper;

import com.chao.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeptMapper {
    public boolean addDept(Dept dept);

    public Dept queryByDeptNo(Long deptNo);

    public List<Dept> queryAll();
}
