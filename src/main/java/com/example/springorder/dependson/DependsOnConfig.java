package com.example.springorder.dependson;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;

/**
 * @author liumingwei
 * @date 2021/6/25
 */
@Configuration
@DependsOn("testB")
public class DependsOnConfig {
    public DependsOnConfig() {
        System.out.println("DependsOnConfig");
    }

    @Bean
    /*@DependsOn("test2")*/
    public void test1() {
        System.out.println("test1");
    }

    @Bean
    public void test2() {
        System.out.println("test2");
    }
}
