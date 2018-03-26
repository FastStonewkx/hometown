package com.test.factory;

import com.test.operation.Operation;
import com.test.operation.OperationMul;

public class MulFactory extends OperationFactory {
    @Override
    public Operation CreateOperation() {
        return new OperationMul();
    }
}
