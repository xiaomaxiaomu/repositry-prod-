package com.qf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class J2005SpcConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(J2005SpcConsumerApplication.class, args);
    }

}
