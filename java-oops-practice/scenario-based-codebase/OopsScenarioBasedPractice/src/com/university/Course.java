package com.university;

//Course class
public class Course {

	private String courseCode;
	private String courseName;

	public Course(String courseCode, String courseName) {
		this.courseCode = courseCode;
		this.courseName = courseName;
	}

	public String getCourseDetails() {
		return courseCode + " - " + courseName;
	}
}
