package com.sda.extraLibs;

import com.google.gson.Gson;

public class GsonExample {

    public static void main(String[] args) {
        String jsonString = "{'author': 'Mark', 'numberOfPages': '100'}";

        Gson gson = new Gson();
        Book myBook = gson.fromJson(jsonString, Book.class);

        System.out.println("My book author " + myBook.author);
        System.out.println("My book size " + myBook.numberOfPages);

        System.out.println("My book to string " + myBook.toString());
        System.out.println("My book to string with gson " + gson.toJson(myBook));
    }
}

class Book {
    public String author;
    public String numberOfPages;
}
