package com.atumu.test.junit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * @author: zhangl
 * @date: 2017/5/2
 * @time: 13:55
 * @description: JUnit：使用ExpectedException进行异常测试
 */
public class SimpleExpectedExceptionTests {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void verifiesTypeAndMessage() {
        thrown.expect(RuntimeException.class);
        thrown.expectMessage("Runtime exception occurred 2");
        throw new RuntimeException("Runtime exception occurred");
    }
}
