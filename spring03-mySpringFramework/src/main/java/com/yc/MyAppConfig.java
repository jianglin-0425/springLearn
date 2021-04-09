package com.yc;

import com.yc.springframework.stereotype.MyComponentScan;
import com.yc.springframework.stereotype.MyConfiguration;

/**
 * @program: testspring
 * @description:
 * @author: LIN
 * @create: 2021~04~05 18:22
 */
@MyConfiguration
//@MyComponentScan(basePackages = {"com.yc.bean"})
@MyComponentScan(basePackages = {"com.yc.dao","com.yc.biz"})
public class MyAppConfig {
//    @MyBean
//    public Hello hw(){
//        return new Hello();
//    }
//    @MyBean
//    public Hello hw2(){
//        return new Hello();
//    }
}
