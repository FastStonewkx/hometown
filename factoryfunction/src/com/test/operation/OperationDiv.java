package com.test.operation;

public class OperationDiv extends Operation {
    @Override
    public double GetRsult() {
        return getNumberA()/getNumberB();
    }
}
