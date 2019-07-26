package com.sda.cohesive;

// Java program to illustrate
// high cohesive behavior
// high level of coupling
class Name {
    String name;

    public String getName( String name ) {
        this.name = name;
        return name;
    }
}

class Age {
    int age;

    public int getAge( int age ) {
        this.age = age;
        return age;
    }
}

class Number {
    int mobile;

    public int getNumber( int mobile ) {
        this.mobile = this.mobile;
        return this.mobile;
    }
}

class DisplayAll {
    public static void main( String[] args ) {
        Name name = new Name();
        Age age = new Age();
        Number number = new Number();

        System.out.println( name.getName("Name") );
        System.out.println( age.getAge(10) );
        System.out.println( number.getNumber(1234567891) );
    }
}