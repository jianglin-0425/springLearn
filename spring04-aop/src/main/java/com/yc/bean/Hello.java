package com.yc.bean;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @program: testspring
 * @description:
 * @author: LIN
 * @create: 2021~04~05 11:48
 */
@Component
public class Hello {

    @PostConstruct
    public void setup(){
        System.out.println("PostConstruct");
    }
    @PreDestroy
    public void destory(){
        System.out.println("PostConstruct");
    }

    public Hello() {
        System.out.println("Hello world 的构造方法");
    }

    public void show() {
        System.out.println("show");
    }
}
