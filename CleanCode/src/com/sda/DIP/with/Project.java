package com.sda.DIP.with;

import java.util.List;

public class Project {

    private List<Developer> developers;

    // Project class does not depend on lower level modules, but rather abstractions.
    // Also, low-level modules and their details depend on abstractions.
    public Project( List<Developer> developers ) {
        this.developers = developers;
    }
    public void implement() {
        developers.forEach( developer -> developer.develop() );
    }
}
