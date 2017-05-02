package com.atumu.test.spring;

import org.junit.Test;
import org.springframework.util.SimpleIdGenerator;

/**
 * @author: zhangl
 * @date: 2017/5/2
 * @time: 14:07
 * @description:
 */
public class SimpleIdGeneratorTests {

    @Test
    public void generateId() throws Exception {
        int s = 10;
        SimpleIdGenerator generator = new SimpleIdGenerator();
        for (int i = 0; i < s; i++) {
            System.out.println(generator.generateId());
        }
    }
}
