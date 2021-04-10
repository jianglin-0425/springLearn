package com.yc.biz;

import org.springframework.stereotype.Service;

/**
 * @program: testspring
 * @description:    若不是实现studnetBiz接口则由enhancespringCGLIB代理
 * @author: LIN
 * @create: 2021~04~04 14:47
 */

@Service
public class StudentBizImpl implements StudentBiz {




    @Override
    public int add(String name) {
        System.out.println("调用可StudentBizImpl 的add方法\t"+name);
        return 0;
    }

    @Override
    public void update(String name) {
        System.out.println("调用可StudentBizImpl 的update方法\t"+name);
    }
    @Override
    public void find(String name) {
        System.out.println("调用可StudentBizImpl 的find方法\t"+name);
    }
}
