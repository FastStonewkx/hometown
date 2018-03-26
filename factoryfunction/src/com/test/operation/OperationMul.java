package com.test.operation;

public class OperationMul extends Operation {
    @Override
    public double GetRsult() {
        return getNumberA()*getNumberB();
    }
}
