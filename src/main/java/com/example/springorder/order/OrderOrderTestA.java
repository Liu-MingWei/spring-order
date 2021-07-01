package com.example.springorder.order;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * @author liumingwei
 * @date 2021/6/25
 */
@Order(-2)
@Service
public class OrderOrderTestA implements OrderTestService {
    public OrderOrderTestA() {
        System.out.println("Order-TestA加载了");
    }

    @Override
    public void test() {
        System.out.println("Order-TestA执行了");
    }
}
