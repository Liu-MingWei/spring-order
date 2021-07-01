package com.example.springorder.dependson;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

/**
 * @author liumingwei
 * @date 2021/6/25
 */
@Configuration
@DependsOn("testB")
public class TestA {
    public TestA() {
        System.out.println("TestA");
    }
}
