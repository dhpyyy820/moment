package com.moment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MoLabelService {
    public static void main(String[] args) {
        SpringApplication.run(MoLabelService.class, args);
    }
}
