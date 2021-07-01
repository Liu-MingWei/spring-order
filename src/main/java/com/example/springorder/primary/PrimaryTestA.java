package com.example.springorder.primary;

import org.springframework.stereotype.Component;

/**
 * @author liumingwei
 * @date 2021/6/25
 */
@Component
public class PrimaryTestA implements PrimaryTestService {
    public PrimaryTestA() {
        System.out.println("PrimaryTestA 加载了");
    }

    @Override
    public void test() {
        System.out.println("PrimaryTestA 执行");
    }
}
