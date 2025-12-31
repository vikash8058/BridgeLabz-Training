package com.inheritance.singleinheritance.problem1;

//Superclass
public class Book {

 // Attributes
 protected String title;
 protected int publicationYear;

 // Parameterized Constructor
 public Book(String title, int publicationYear) {
     this.title = title;
     this.publicationYear = publicationYear;
 }

 // Method to display book information
 void displayInfo() {
     System.out.println("Book Title: " + title);
     System.out.println("Publication Year: " + publicationYear);
 }
}
