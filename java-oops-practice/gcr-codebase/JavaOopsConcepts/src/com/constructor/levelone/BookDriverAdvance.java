package com.constructor.levelone;

class BookAdvance {

    // Variables with access modifiers
    public String ISBN;
    protected String title;
    private String author;

    // Parameterized Constructor
    BookAdvance(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to get author
    public String getAuthor() {
        return author;
    }

    // Public method to set author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Display Book Details
    void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass to demonstrate access modifiers
class EBook extends BookAdvance {

    EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    void displayEBookDetails() {
        System.out.println("EBook ISBN: " + ISBN);
        System.out.println("EBook Title: " + title);
    }
}

public class BookDriverAdvance {
    public static void main(String[] args) {

        BookAdvance book1 = new BookAdvance("ISBN101", "Java Basics", "Hemant");
        System.out.println("Book Details:");
        book1.displayBookDetails();

        book1.setAuthor("Rahul");
        System.out.println("\nAfter Updating Author:");
        System.out.println("Updated Author: " + book1.getAuthor());

        EBook ebook = new EBook("ISBN202", "Advanced Java", "Amit");
        System.out.println("\nEBook Details:");
        ebook.displayEBookDetails();
    }
}

