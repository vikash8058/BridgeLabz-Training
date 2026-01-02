package com.university;

//Main class
public class UniversityCourseEnrollmentSystem {

 public static void main(String[] args) {

     Student s1 = new Undergraduate(101, "Vikash");
     Student s2 = new Postgraduate(102, "Vishal");

     Course c1 = new Course("CS101", "Object Oriented Programming");
     Course c2 = new Course("CS102", "Data Structures");

     Enrollment e1 = new Enrollment(s1, c1);
     e1.enroll();
     System.out.println(s1.getTranscript());
     System.out.println("------------------------------------------");
     
     Enrollment e2 = new Enrollment(s2, c1);
     e2.enroll();
     
     Faculty faculty = new Faculty("Dr. Sharma", s1);
     faculty.assignGrade(85);   // grade assignment
     System.out.println(s1.getTranscript());
     
 }
}

