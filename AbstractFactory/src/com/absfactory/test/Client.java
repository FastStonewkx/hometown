package com.absfactory.test;

import com.absfactory.demo.*;

public class Client {
    public static void main(String[] args){
        User user = new User();
        Department dept = new Department();


        //只需确定实例化哪一个数据库访问对象给factory
        IFactory factory1 = new SqlServerFactory();
//        IFactory factory2 = new AccessFactory();

        //与具体的数据库访问解除了依赖
        IUser iu = factory1.createUser();

        iu.Inser(user);
        iu.getUser(1);

        //与具体的数据库解除了依赖
        IDepartment id = factory1.createDepartment();

        id.Insert(dept);
        id.getDepartment(1);


    }
}
