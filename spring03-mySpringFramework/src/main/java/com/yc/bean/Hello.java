package com.yc.bean;


import com.yc.springframework.stereotype.MyComponent;
import com.yc.springframework.stereotype.MyPostConstruct;
import com.yc.springframework.stereotype.MyPreDestroy;

/**
 * @program: testspring
 * @description:
 * @author: LIN
 * @create: 2021~04~05 11:48
 */
@MyComponent
public class Hello {

    @MyPostConstruct
    public void setup(){
        System.out.println("PostConstruct");
    }
    @MyPreDestroy
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
