package com.sda.liskov;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PrintArray {

    public void readList( List<String> list ) {
        list.forEach(System.out::println);
    }

    public static void main( String[] args ) {
        PrintArray print = new PrintArray();

        List<String> linkeList = new LinkedList<String>();
        linkeList.add("one");
        linkeList.add("two");

        print.readList(linkeList);

        List<String> stack = new Stack<>();
        stack.add("one");
        stack.add("two");

        print.readList(stack);
    }
}
