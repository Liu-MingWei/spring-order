package com.example.springorder.order;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liumingwei
 * @date 2021/6/25
 */
@Service
public class OrderRunTest {
    public OrderRunTest(List<OrderTestService> testList) {
        testList.forEach(test -> {
            test.test();
        });

    }
}
