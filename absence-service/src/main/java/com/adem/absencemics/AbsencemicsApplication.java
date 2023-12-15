package com.adem.absencemics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class AbsencemicsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AbsencemicsApplication.class, args);
    }

}
