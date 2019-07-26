package com.sda.DIP.without;

public class Project {

    // Project class is a high-level module,
    // and it depends on low-level modules such as BackEndDeveloper and FrontEndDeveloper.
    private BackEndDeveloper backEndDeveloper = new BackEndDeveloper();
    private FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper();

    public void implement() {
        backEndDeveloper.writeJava();
        frontEndDeveloper.writeJavascript();
    }
}
