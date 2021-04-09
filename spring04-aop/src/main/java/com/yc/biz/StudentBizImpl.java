package com.yc.biz;

import com.yc.dao.StudentDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: testspring
 * @description:    若不是实现studnetBiz接口则由enhancespringCGLIB代理
 * @author: LIN
 * @create: 2021~04~04 14:47
 */

@Service
public class StudentBizImpl implements StudentBiz {
    private StudentDao dao;

    public StudentBizImpl(StudentDao dao) {
        this.dao = dao;
    }

    public StudentBizImpl() {
    }

    public StudentDao getDao() {
        return dao;
    }


//    @MyAutowire
    @Resource(name = "studentDaoJpaImpl")
    public void setDao(StudentDao dao) {
        this.dao = dao;
    }


    @Override
    public int add(String name) {
        System.out.println("================业务层===============");
        System.out.println("用户名是否重名");
        int result=dao.add(name);
        System.out.println("================业务操作结束===============");
        return result;
    }

    @Override
    public void update(String name) {
        System.out.println("================业务层===============");
        System.out.println("用户名是否重名");
        dao.update(name);
        System.out.println("================业务操作结束===============");
    }
    @Override
    public void find(String name) {
        System.out.println("================业务层===============");
        System.out.println("用户名是否重名");
        dao.find(name);
        System.out.println("================业务操作结束===============");
    }
}
