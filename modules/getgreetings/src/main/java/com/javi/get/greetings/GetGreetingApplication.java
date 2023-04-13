package com.javi.get.greetings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GetGreetingApplication {
    public static void main(String[] args) {
        SpringApplication.run(GetGreetingApplication.class, args);
    }
}