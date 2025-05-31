package com.exercismcode.exercismcode.calculatorconundrum;

import com.exercismcode.exercismcode.exceptions.IllegalOperationException;


public class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) throw new IllegalArgumentException("Operation cannot be null");
        if(operation.isEmpty()) throw new IllegalArgumentException("Operation cannot be empty");
        if(operand2 == 0) {
            throw new IllegalOperationException("Division by zero is not allowed", new ArithmeticException());
        } else {
            switch (operation) {
                case "+":
                    return operand1 + " + " + operand2 + " = " + (operand1 + operand2);
                case "*":
                    return operand1 + " * " + operand2 + " = " + (operand1 * operand2);
                case "/":
                    return operand1 + " / " + operand2 + " = " + (operand1 / operand2);
                default:
                    throw new IllegalOperationException("Operation '" + operation + "' does not exist");
            }
        }
    }
}
