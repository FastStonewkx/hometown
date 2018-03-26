package com.test.client;

import com.test.factory.AddFactory;
import com.test.factory.OperationFactory;
import com.test.operation.Operation;
import com.test.operation.OperationAdd;

public class ClientBank {
    public static void main(String[] args){
       Operation oper;
       OperationFactory opef = new AddFactory();

       oper =opef.CreateOperation();
        oper.setNumberA(15);
        oper.setNumberB(11);
        System.out.println(oper.GetRsult());
    }
}
