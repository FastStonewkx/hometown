package com.test.operation;

public class OperationSub extends Operation {
    @Override
    public double GetRsult() {
        return getNumberA()-getNumberB();
    }
}
