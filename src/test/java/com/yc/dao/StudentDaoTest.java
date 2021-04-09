package com.yc.dao;

import com.yc.biz.StudentBizImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentDaoTest {



    StudentDao studentDao;
    StudentBizImpl studentBiz;

    @Before
    public void setUp() throws Exception {
        //1.  能否自动完成  实例化对象    -> IOC  控制反转     -> 用容器实例化对象     有容器来完成

        studentDao=new StudentDaoJpaImpl();
//        studentBiz=new StudentBizImpl(studentDao);            //  IOC
        studentBiz=new StudentBizImpl();
        //2.能否自动完成   装配过程    ->  DI   依赖注入          ->   由容器装配对象
        studentBiz.setDao(studentDao);
    }

    @Test
    public void add() {
        studentDao.add("张三");
    }

    @Test
    public void update() {
        studentDao.update("张三");
    }

    @Test
    public void testBizAdd() {
        studentBiz.add("张三");
    }
}