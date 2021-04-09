package com.yc.dao;

import com.yc.AppConfig;
import com.yc.biz.StudentBizImpl;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BizTest extends TestCase {

    private ApplicationContext ac;

    private StudentBizImpl studentBiz;

    @Override
    @Before
    public void setUp() throws Exception {
        ac = new AnnotationConfigApplicationContext(AppConfig.class);
        studentBiz=(StudentBizImpl)ac.getBean("studentBizImpl");
    }
    @Test
    public void testadd() {
        studentBiz.add("李四");
    }
    @Test
    public void testupdate() {
        studentBiz.update("李四");
    }

}