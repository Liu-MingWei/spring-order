package com.example.springorder.config;

import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.annotation.Configuration;

/**
 * @author liumingwei
 * @date 2021/7/1
 */
@Configuration
@AutoConfigureOrder(1)
public class BeanOrderConfigurationB {
    public BeanOrderConfigurationB() {
        System.out.println("BeanOrderConfigurationB 加载了");
    }
}
