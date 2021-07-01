package com.example.springorder.primary;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author liumingwei
 * @date 2021/6/25
 */
@Component
public class PrimaryRunTest {
    public PrimaryRunTest(PrimaryTestService test) {
        test.test();

    }
}
