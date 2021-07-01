package com.example.springorder.order;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * @author liumingwei
 * @date 2021/6/25
 */
@Order(-5)
@Service
public class OrderOrderTestB implements OrderTestService {
    public OrderOrderTestB() {
        System.out.println("Order-TestB加载了");
    }

    @Override
    public void test() {
        System.out.println("Order-TestB执行了");
    }
}
