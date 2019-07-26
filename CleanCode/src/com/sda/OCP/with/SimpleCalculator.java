package com.sda.OCP.with;

import java.security.InvalidParameterException;

public class SimpleCalculator implements ICalculator {
    @Override
    public void calculate(IOperation operation) {
        if(operation == null) {
            throw new InvalidParameterException("Some message");
        }

        operation.performOperation();
    }
}
