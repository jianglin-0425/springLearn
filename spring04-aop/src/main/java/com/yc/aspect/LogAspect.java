package com.yc.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: testspring
 * @description:
 * @author: LIN
 * @create: 2021~04~09 19:34
 */
@Aspect                 //      切面类：            你要增强的功能写到这里
@Component              // IOC注释,      以实现让spring托管的功能
public class LogAspect {

    //切入点的声明        pointcut    signature
    @Pointcut("execution(* com.yc.biz.StudentBizImpl.add*(..))")
    //切入点表达式:那些方法上加增强   *表示类型。private等         ，，表示任意参数
    private void add(){             //方法名任意

    }
    @Pointcut("execution(* com.yc.biz.StudentBizImpl.update*(..))")
    private void update(){

    }

    @Pointcut("add()||update()")
    private void addAndUpdate(){

    }

    //切入点表达式的语法 :   ?代表出现0次或1次
    //modifiers-pattern:修饰项
    //ret-type-pattern      返回类型
    // declaring-type-pattern
    // name-pattern     名字模型
    // throws-pattern

//    execution(modifiers-pattern? ret-type-pattern declaring-type-pattern?name-pattern(param-pattern)
//            throws-pattern?)


    @Before("com.yc.aspect.LogAspect.addAndUpdate()")           //括号内为@PointCut注释的方法
    public void log(){
        System.out.println("===============前置增强的日志==================");
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String dstr=sdf.format(d);
        System.out.println("执行时间为:"+dstr);
        System.out.println("=============前置增强的日志结束===============");
    }
}
