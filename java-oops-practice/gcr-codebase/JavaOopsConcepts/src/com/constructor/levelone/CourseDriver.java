package com.constructor.levelone;

class Course {

    // Instance Variables
    private String courseName;
    private int duration;
    private double fee;

    // Class Variable
    private static String instituteName = "BridgeLabz";

    // Parameterized Constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance Method
    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
    }

    // Class Method
    static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}

public class CourseDriver {
    public static void main(String[] args) {

        Course course1 = new Course("Java Full Stack", 6, 45000);
        System.out.println("Course 1:");
        course1.displayCourseDetails();

        Course course2 = new Course("Data Science", 8, 60000);
        System.out.println("\nCourse 2:");
        course2.displayCourseDetails();

        // Update Institute Name
        Course.updateInstituteName("BridgeLabz Solutions");

        System.out.println("\nAfter Updating Institute Name:");
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}
