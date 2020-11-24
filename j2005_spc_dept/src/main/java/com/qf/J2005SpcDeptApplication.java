package com.qf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient//开启注册中心的客户端服务
@MapperScan(basePackages = {"com.qf.mapper"})
public class J2005SpcDeptApplication {

    public static void main(String[] args) {
        SpringApplication.run(J2005SpcDeptApplication.class, args);
    }

}
