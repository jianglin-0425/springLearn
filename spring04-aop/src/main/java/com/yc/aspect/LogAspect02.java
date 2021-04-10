package com.yc.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @program: testspring
 * @description:
 * @author: LIN
 * @create: 2021~04~09 19:34
 */
@Aspect                 //      切面类：            你要增强的功能写到这里
@Component              // IOC注释,      以实现让spring托管的功能
@Order(value = 1)
public class LogAspect02 {



    @Pointcut("execution(* com.yc.biz.StudentBizImpl.find*(..))")
    private void find(){

    }

    @Around("com.yc.aspect.LogAspect02.find()")
    public Object compute(ProceedingJoinPoint pjp) throws Throwable {
        // start stopwatch
        System.out.println("******************compute2 进入       增强了**************");
        Long start=System.currentTimeMillis();
        Object retVal = pjp.proceed();              //目标类的目标方法
        Long end=System.currentTimeMillis();
        System.out.println("*****************compute2要退出增强了");
        System.out.println("*************************这个方法运行的时间为:"+(end-start));
        return retVal;
    }

}
