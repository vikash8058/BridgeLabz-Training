package com.constructor.levelone;

public class Person {

    // Attributes
    private String name;
    private int age;
    private String city;

    // Default Constructor
    Person() {
        this.name = "Unknown";
        this.age = 18;
        this.city = "Not Assigned";
    }

    // Parameterized Constructor
    Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    // Copy Constructor
    Person(Person otherPerson) {
        this.name = otherPerson.name;
        this.age = otherPerson.age;
        this.city = otherPerson.city;
    }

    // Display Person Details
    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }
}


