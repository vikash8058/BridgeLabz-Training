package com.inheritance.singleinheritance.problem1;

//Subclass
public class Author extends Book {

 // Additional Attributes
 private String name;
 private String bio;

 // Parameterized Constructor
 public Author(String title, int publicationYear, String name, String bio) {
     super(title, publicationYear);
     this.name = name;
     this.bio = bio;
 }

 // Method to display book and author information
 void displayInfo() {
     super.displayInfo();
     System.out.println("Author Name: " + name);
     System.out.println("Author Bio: " + bio);
 }
}
