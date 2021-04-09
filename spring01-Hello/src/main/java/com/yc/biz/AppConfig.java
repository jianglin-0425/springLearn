package com.yc.biz;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: testspring
 * @description:
 * @author: LIN
 * @create: 2021~04~04 15:11
 */
@Configurable       //表示当前的类是一个配置类
@ComponentScan(basePackages = "com.yc")         //将来要托管的bean要扫描的包及子包
public class AppConfig {

}
