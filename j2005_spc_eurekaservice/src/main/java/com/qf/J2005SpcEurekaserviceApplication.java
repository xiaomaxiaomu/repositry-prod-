package com.qf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class J2005SpcEurekaserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(J2005SpcEurekaserviceApplication.class, args);
    }

}
