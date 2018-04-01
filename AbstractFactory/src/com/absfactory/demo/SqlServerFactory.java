package com.absfactory.demo;

public class SqlServerFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new SqlserverUser();
    }

    public IDepartment createDepartment(){
        return new SqlServerDepartment();
    }
}
