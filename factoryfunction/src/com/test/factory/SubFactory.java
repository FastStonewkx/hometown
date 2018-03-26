package com.test.factory;

import com.test.operation.Operation;
import com.test.operation.OperationSub;

public class SubFactory extends OperationFactory {
    @Override
    public Operation CreateOperation() {
        return new OperationSub();
    }
}
