package com.moment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MoRegistry {
    public static void main(String[] args) {
        SpringApplication.run(MoRegistry.class, args);
    }
}
