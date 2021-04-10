package com.yc;

import com.yc.biz.StudentBiz;
import com.yc.biz.StudentBizImpl;

/**
 * @program: testspring
 * @description:
 * @author: LIN
 * @create: 2021~04~10 19:31
 */
public class Test {
    public static void main(String[] args) {
        StudentBiz target=new StudentBizImpl();         //spring   使用IOC
        LogAspect la=new LogAspect(target);
        Object obj=la.createProxy();    //Obj是taget的代理对象

//        System.out.println(obj);
        if (obj instanceof StudentBiz) {
            StudentBiz sb= (StudentBiz) obj;
            sb.find("张三");
        }
    }
}
