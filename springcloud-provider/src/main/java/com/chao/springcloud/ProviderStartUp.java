package com.chao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //在服务启动后，自动注册到Eureka
public class ProviderStartUp {
    public static void main(String[] args) {
        SpringApplication.run(ProviderStartUp.class,args);
    }
}
