package com.chao.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {
    private long deptNo;

    private String deptName;

    private String dbSource;

    public Dept(String deptName) {
        this.deptName = deptName;
    }
}