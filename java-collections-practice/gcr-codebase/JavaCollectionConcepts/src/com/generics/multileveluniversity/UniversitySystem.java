package com.generics.multileveluniversity;

import java.util.*;

public class UniversitySystem {

	public static void main(String[] args) {

		Course<ExamCourse> c1 = new Course<>("Data Structures", new ExamCourse());

		Course<AssignmentCourse> c2 = new Course<>("Web Development", new AssignmentCourse());

		Course<ResearchCourse> c3 = new Course<>("AI Research", new ResearchCourse());

		c1.display();
		c2.display();
		c3.display();

		List<CourseType> courses = new ArrayList<>();
		courses.add(new ExamCourse());
		courses.add(new AssignmentCourse());
		courses.add(new ResearchCourse());

		System.out.println("\n---- All Course Types ----");
		CourseUtil.displayAll(courses);
	}
}
