package com.sda.DIP.with;

public class FrontEndDeveloper implements Developer {

    @Override
    public void develop() {
        writeJavascript();
    }
    public void writeJavascript() {
        System.out.println("Writng java script");
    }
}
