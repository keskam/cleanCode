package com.sda.cleanCode;

/**
 * This class is a good example of clean code
 * Use this class as an example
 * */
public class CleanCodeClass {

    public static int startingIndex = 0;
    String message = null;
    String message1 = null;
    String MeSSage2 = "Try it"; // Keep this for testing


    public void printMessage() {
        System.out.println("New message " + message);
    }

    public void setMessage1(String message1) {
        this.message1 = message1;
    }

    private String stringManipulation (String firstParameter, String secondParameter) {
            return message1 + message1 + firstParameter + secondParameter;
    }
}
