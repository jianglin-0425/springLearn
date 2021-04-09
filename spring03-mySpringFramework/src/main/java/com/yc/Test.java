package com.yc;

import com.yc.biz.StudentBizImpl;
import com.yc.springframework.context.MyAnnotationConfigApplicationContext;
import com.yc.springframework.context.MyApplicationContext;

/**
 * @program: testspring
 * @description:
 * @author: LIN
 * @create: 2021~04~05 18:22
 */
public class Test {
    public static void main(String[] args) {
        MyApplicationContext ac=new MyAnnotationConfigApplicationContext(MyAppConfig.class);
//        Hello h= (Hello) ac.getBean("hw");
//        h.show();
        StudentBizImpl biz= (StudentBizImpl) ac.getBean("studentBizImpl");
        System.out.println(biz.getDao().toString());
    }
}
