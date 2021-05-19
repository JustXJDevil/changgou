package com.clark.cgeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CgEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CgEurekaApplication.class, args);
    }

}
