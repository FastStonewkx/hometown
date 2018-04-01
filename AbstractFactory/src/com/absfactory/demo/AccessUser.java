package com.absfactory.demo;

public class AccessUser implements IUser {
    @Override
    public void Inser(User user) {
        System.out.println("在access中为user表中插入了一条数据");
    }

    @Override
    public Department getUser(int id) {
        System.out.println("在Access表中根据id得到user表一条记录");
        return null;
    }
}
