package com.stackoverflow.springtest.listeners;

import com.stackoverflow.springtest.AutowiredBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.support.AbstractTestExecutionListener;

import static org.junit.Assert.assertNotNull;

public class SimpleClassTestListener extends AbstractTestExecutionListener {

    @Autowired
    private AutowiredBean bean;

    @Override
    public void beforeTestClass(TestContext testContext) throws Exception {
        testContext.getApplicationContext()
                .getAutowireCapableBeanFactory()
                .autowireBean(this);
        assertNotNull(bean);
    }
}
