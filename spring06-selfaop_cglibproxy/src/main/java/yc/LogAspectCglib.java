package yc;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * @program: testspring
 * @description:
 * @author: LIN
 * @create: 2021~04~10 19:22
 */
public class LogAspectCglib implements MethodInterceptor {

    private Object target;      //目标类的对象

    public LogAspectCglib(Object target) {
        this.target = target;
    }

    public Object createProxy(){
        //新建一个代理接口
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("代理类的对象:"+o.getClass());
        System.out.println("目标类的方法:"+method);


        //前置增强
        if (method.getName().startsWith("add")){
            log();
        }
        System.out.println("方法中的参数:"+objects);
        System.out.println("要代理的方法"+methodProxy);

        Object returnValue=method.invoke(this.target,objects);         //就相当于直接执行了     StudentImpl的目标方法
        //后置增强
        return returnValue;

    }
    private void log(){
        System.out.println("=========before advice========");
        System.out.println("hello ,this is "+new Date());
    }

}
