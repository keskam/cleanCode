package com.sda.cohesive;

// Java program to illustrate high cohesive behavior
class Multiply {
    int first = 5;
    int second = 5;
    public int mul( int first, int second ) {
        this.first = first;
        this.second = second;
        return first * second;
    }
}

class Display {
    public static void main( String[] args ) {
        Multiply multiply = new Multiply();
        System.out.println(multiply.mul(5, 5));
    }
}
