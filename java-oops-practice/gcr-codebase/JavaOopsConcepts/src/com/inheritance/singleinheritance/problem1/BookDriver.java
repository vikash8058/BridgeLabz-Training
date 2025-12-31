package com.inheritance.singleinheritance.problem1;

public class BookDriver {
    public static void main(String[] args) {

        Author authorBook = new Author("Java Programming",2022,"James Gosling","Creator of the Java programming language");

        System.out.println("Library Book Details:");
        authorBook.displayInfo();
    }
}
