package com.test.factory;

import com.test.operation.Operation;
import com.test.operation.OperationDiv;

public class DivFactory extends OperationFactory {
    @Override
    public Operation CreateOperation() {
        return new OperationDiv();
    }
}
