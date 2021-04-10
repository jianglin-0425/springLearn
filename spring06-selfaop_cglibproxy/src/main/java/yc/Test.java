package yc;

import yc.biz.StudentBizImpl;

/**
 * @program: testspring
 * @description:
 * @author: LIN
 * @create: 2021~04~10 19:31
 */
public class Test {
    public static void main(String[] args) {
        StudentBizImpl target=new StudentBizImpl();         //spring   使用IOC
        LogAspectCglib la=new LogAspectCglib(target);
        //生成代理对象
        Object obj=la.createProxy();    //Obj是taget的代理对象
        if (obj instanceof StudentBizImpl){
            StudentBizImpl s= (StudentBizImpl) obj;
            s.add("张三");
            s.find("李四");
            s.update("王五");
        }
    }
}
