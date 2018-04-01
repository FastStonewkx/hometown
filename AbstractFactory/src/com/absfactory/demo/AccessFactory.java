package com.absfactory.demo;

public class AccessFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    public IDepartment createDepartment(){
        return  new AccessDepartment();
    }
}
