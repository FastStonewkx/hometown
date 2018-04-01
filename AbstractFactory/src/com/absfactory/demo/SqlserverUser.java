package com.absfactory.demo;

public class SqlserverUser implements IUser{
    @Override
    public void Inser(User user) {
        System.out.println("在sqlserver中给user表增加一条记录");
    }

    @Override
    public Department getUser(int id) {
        System.out.println("在sqlserver中根据id得到user表的一条记录");
        return null;
    }
}
