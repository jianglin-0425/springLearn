package com.yc.biz;

import com.yc.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: testspring
 * @description:
 * @author: LIN
 * @create: 2021~04~04 14:47
 */
@Service
public class StudentBizImpl {
    private StudentDao dao;

    public StudentBizImpl(StudentDao dao) {
        this.dao = dao;
    }

    public StudentBizImpl() {
    }


    //方案一
    //@Inject       //javax中的依赖注入   如果有多个对象(比如这里有StudentDaoJpaImpl,StudentDaoMybatisImpl对象)
    // 因为有多个对象可以注入 ，所以这里必须使用@Name("StudentDaoMybatisImpl")，若只有一个对象，则不需要写
    //方案二
    @Autowired      //org.springframe
    @Qualifier("studentDaoMybatisImpl")
     // 因为有多个对象可以注入 ，所以这里必须使用@Name("StudentDaoMybatisImpl")，若只有一个对象，则不需要写
    @Resource(name = "studentDaoJpaImpl")       //沒有找到同名的托管bean     則按类型注入
    public void setDao(StudentDao dao) {
        this.dao = dao;
    }


    public int add(String name) {
        System.out.println("================业务层===============");
        System.out.println("用户名是否重名");
        int result=dao.add(name);
        System.out.println("================业务操作结束===============");
        return result;
    }

    public void update(String name) {
        System.out.println("================业务层===============");
        System.out.println("用户名是否重名");
        dao.update(name);
        System.out.println("================业务操作结束===============");
    }
}
