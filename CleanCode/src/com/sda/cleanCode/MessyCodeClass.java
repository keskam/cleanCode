// This class is a good example of clean code
/**
 * Use this class as an example
 * */
package com.sda.cleanCode;
import java.lang.*;

// This is a begging of the class
public class MessyCodeClass {

    int n;
    String test;
    public static int startingindex = 0;



    public void printMessage() {
        System.out.println("New message " + test);}

    /*
     * Keep this for testing
     * */
    String message1, MeSSage2 = "Try it";

        public MessyCodeClass(String message) {
                    this.test = message;
    }
    public void setMessage1(String message1)
        {
        this.message1 = message1;
                }

            // Keep this maybe needed
    private String IAMnotsureDoineedthisBUTIdoesSomeStringManipulationFromOldCodebaseSowillkeepItanduseiTMAYBEforSomethingORmaybeNot      (String _1, String string) {
            return message1 + message1 + _1 + string; // Why we need this???
    }
}
