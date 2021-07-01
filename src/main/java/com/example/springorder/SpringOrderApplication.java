package com.example.springorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.example.springorder.nulla" )
public class SpringOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringOrderApplication.class, args);
    }

}
