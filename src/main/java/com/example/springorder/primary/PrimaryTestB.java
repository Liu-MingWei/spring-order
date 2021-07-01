package com.example.springorder.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author liumingwei
 * @date 2021/6/25
 */
@Primary
@Component
public class PrimaryTestB implements PrimaryTestService {
    public PrimaryTestB() {
        System.out.println("PrimaryTestB 加载了");
    }

    @Override
    public void test() {
        System.out.println("PrimaryTestB 执行");
    }
}
