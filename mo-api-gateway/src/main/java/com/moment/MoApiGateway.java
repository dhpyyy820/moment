package com.moment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient  // 开启Eureka客户端
public class MoApiGateway {
    public static void main(String[] args) {
        SpringApplication.run(MoApiGateway.class, args);
    }
}
