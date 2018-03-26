package com.test.factory;

import com.test.operation.Operation;
import com.test.operation.OperationAdd;

public class AddFactory extends OperationFactory {
    @Override
    public Operation CreateOperation() {
        return new OperationAdd();
    }
}
