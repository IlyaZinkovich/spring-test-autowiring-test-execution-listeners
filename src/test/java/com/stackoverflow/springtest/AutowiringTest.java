package com.stackoverflow.springtest;

import com.stackoverflow.springtest.listeners.SimpleClassTestListener;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfig.class)
@TestExecutionListeners(mergeMode = TestExecutionListeners.MergeMode.MERGE_WITH_DEFAULTS, listeners = {
        SimpleClassTestListener.class })
public class AutowiringTest {

    @Test
    public void test() {
        assertTrue(true);
    }
}
