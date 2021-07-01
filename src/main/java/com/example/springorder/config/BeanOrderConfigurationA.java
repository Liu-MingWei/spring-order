package com.example.springorder.config;

import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.annotation.Configuration;

/**
 * @author liumingwei
 * @date 2021/7/1
 */
@Configuration
@AutoConfigureOrder(10)
public class BeanOrderConfigurationA {
    public BeanOrderConfigurationA() {
        System.out.println("BeanOrderConfigurationA 加载了");
    }



    
}
