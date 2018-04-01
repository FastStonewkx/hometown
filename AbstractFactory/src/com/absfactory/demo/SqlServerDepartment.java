package com.absfactory.demo;

public class SqlServerDepartment implements IDepartment {
    @Override
    public void Insert(Department department) {
        System.out.println("在SqlServer 中给 Department表增加一条记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在SqlServer中根据ID得到Department表记录");

        return null;
    }

}
