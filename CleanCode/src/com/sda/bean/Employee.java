package com.sda.bean;

import java.io.Serializable;

public class Employee implements Serializable {

    private int id;
    private String name;
    private int salary;
    private boolean junior;

    public Employee() {}

    public int getId() {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary( int salary ) {
        this.salary = salary;
    }

    public boolean isJunior() {
        return junior;
    }

    public void setJunior( boolean junior ) {
        this.junior = junior;
    }
}
