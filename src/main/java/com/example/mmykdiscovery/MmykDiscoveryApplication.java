package com.example.mmykdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MmykDiscoveryApplication {

    public static void main(String[] args) {
        System.out.println("hello");
        SpringApplication.run(MmykDiscoveryApplication.class, args);
    }

}
