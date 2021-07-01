package com.example.springorder.dependson;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author liumingwei
 * @date 2021/6/25
 */
@Configuration
public class TestB {
    public TestB() {
        System.out.println("TestB");
    }
}
