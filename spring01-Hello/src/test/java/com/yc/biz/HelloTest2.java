package com.yc.biz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//用来加载spring配置
@ContextConfiguration(classes = AppConfig.class)
public class HelloTest2 {

    private ApplicationContext ac;

    @Test
    public void testHello() {
        Hello h=(Hello)ac.getBean("hello");
        h.hello();

        Hello h2=(Hello)ac.getBean("hello");
        h2.hello();
    }
}