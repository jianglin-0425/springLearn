package com.yc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

/**
 * @program: testspring
 * @description:
 * @author: LIN
 * @create: 2021~04~10 19:22
 */
public class LogAspect implements InvocationHandler {

    private Object target;      //目标类的对象

    public LogAspect(Object target) {
        this.target = target;
    }

    public Object createProxy(){
        //新建一个代理接口
        return Proxy.newProxyInstance(this.target.getClass().getClassLoader(),this.target.getClass().getInterfaces(),this);
    }

    @Override           //回调方法      当jvm调用代理对象的被代理的方法时          会有jvm自动调用这个invoke
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("代理类的对象:"+proxy.getClass());
        System.out.println("目标类的方法:"+method.getName());

        if (method.getName().equalsIgnoreCase("add")){//装换成切入点表达式   --->AspectJ表达式
            //前置增强
            log();
        }

        Object returnValue=method.invoke(this.target,args);         //就相当于直接执行了     StudentImpl的目标方法
        //后置增强
        return returnValue;
    }
    private void log(){
        System.out.println("=========before advice========");
        System.out.println("hello ,this is "+new Date());
    }
}
