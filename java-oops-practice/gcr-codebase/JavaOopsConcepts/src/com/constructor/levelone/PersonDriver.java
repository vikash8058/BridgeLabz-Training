package com.constructor.levelone;

public class PersonDriver {
    public static void main(String[] args) {

        // Default Constructor
        Person person1 = new Person();
        System.out.println("Person 1:");
        person1.displayPersonDetails();

        // Parameterized Constructor
        Person person2 = new Person("Rahul", 22, "Bhopal");
        System.out.println("\nPerson 2:");
        person2.displayPersonDetails();

        // Copy Constructor
        Person person3 = new Person(person2);
        System.out.println("\nPerson 3 (Copy of Person 2):");
        person3.displayPersonDetails();
    }
}
