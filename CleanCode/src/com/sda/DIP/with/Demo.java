package com.sda.DIP.with;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {

    private static BackEndDeveloper backEndDeveloper = new BackEndDeveloper();
    private static FrontEndDeveloper frontEndDeveloper= new FrontEndDeveloper();

    public static void main(String[] args) {
        Project project = new Project(new ArrayList<>(Arrays.asList(frontEndDeveloper, backEndDeveloper)));
        project.implement();
    }

}

