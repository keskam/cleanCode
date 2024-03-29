package com.sda.OCP.with;

public class Multiplication implements IOperation
{
    private double firstOperand;
    private double secondOperand;
    private double result = 0.0;

    public Multiplication(double firstOperand, double secondOperand) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }

    public double getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(double firstOperand) {
        this.firstOperand = firstOperand;
    }

    public double getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(double secondOperand) {
        this.secondOperand = secondOperand;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void performOperation() {
        result = firstOperand * secondOperand;
        System.out.println("Mult result " + result);
    }
}
