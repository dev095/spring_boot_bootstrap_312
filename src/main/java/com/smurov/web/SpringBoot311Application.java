package com.smurov.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class SpringBoot311Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot311Application.class, args);
    }

}
