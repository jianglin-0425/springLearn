package com.yc;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: testspring
 * @description:
 * @author: LIN
 * @create: 2021~04~04 15:37
 */
@Configurable
@ComponentScan(basePackages = "com.yc")
public class AppConfig {


    //bean容器是Map<String,Object> 方法名为 key
    //  studentBizImpl是键名   StudentBizImpl对象为值
//    @Bean
//    public StudentBizImpl studentBizImpl(){
//        return new StudentBizImpl();
//    }
}
