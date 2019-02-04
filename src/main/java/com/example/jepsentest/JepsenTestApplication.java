package com.example.jepsentest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class JepsenTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(JepsenTestApplication.class, args);
    }

}

