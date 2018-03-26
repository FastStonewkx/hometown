package com.test.operation;

public class OperationAdd extends Operation {
    @Override
    public double GetRsult() {
        return getNumberA()+getNumberB();
    }
}
