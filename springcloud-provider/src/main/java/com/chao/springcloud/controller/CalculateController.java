package com.chao.springcloud.controller;

import com.chao.springcloud.service.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@CrossOrigin    //只加这个注解就可以解决跨域问题
public class CalculateController {
    @Autowired
    CalculateService calculateService;

    @PostMapping(value = "/calculate/add")
    public String add(HttpServletRequest request, HttpServletResponse response){
        int a = Integer.parseInt(request.getParameter("num1"));
        int b = Integer.parseInt(request.getParameter("num2"));

        System.out.println(a);
        System.out.println(b);
        System.out.println(calculateService.add(a,b));

        return "和为：" + calculateService.add(a,b);
    }
}
