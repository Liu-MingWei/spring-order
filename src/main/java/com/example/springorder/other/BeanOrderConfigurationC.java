package com.example.springorder.other;

import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

/**
 * @author liumingwei
 * @date 2021/7/1
 */
@Configuration
public class BeanOrderConfigurationC {
    public BeanOrderConfigurationC() {
        System.out.println("BeanOrderConfigurationC 加载了");
    }
}
