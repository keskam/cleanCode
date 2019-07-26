package com.sda.DIP.with;

public class BackEndDeveloper implements Developer {

    @Override
    public void develop() {
        writeJava();
    }
    private void writeJava() {
        System.out.println("Writing java code");
    }
}
