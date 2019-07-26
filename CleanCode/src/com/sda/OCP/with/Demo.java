package com.sda.OCP.with;

public class Demo {

    private static Addition addition = new Addition(5, 10);
    private static Substraction substraction = new Substraction(5, 1);

    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.calculate(addition);
        simpleCalculator.calculate(substraction);
    }
}
