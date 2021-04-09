package com.yc.biz;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class HelloTest extends TestCase {

    private ApplicationContext ac;

    @Override
    @Before
    public void setUp() throws Exception {
        //AnnotationConfigApplicationContext    基于注解的配置容器类
        ac=new AnnotationConfigApplicationContext(AppConfig.class);
        //读取  appconfig.class   ->  basePackage ="com.yc"   ->  得到要扫描的路径
        //要检查这些包中的上是否有@Component注解      如有,,,则实例化
        //存到一个Map<String,Object> ====ac
    }

    @Test
    public void testHello() {
        Hello h=(Hello)ac.getBean("hello");
        h.hello();

        Hello h2=(Hello)ac.getBean("hello");
        h2.hello();
    }
}