package com.collegeinformationsystem;

public class CampusConnectApp {
	public static void main(String[] args) {
		
		Faculty faculty1=new Faculty("Viplao Chaure","viplao@gmail.com",102);
		Faculty faculty2=new Faculty("Pratimesh","pratimesh@gmail.com",103);
		
		Student student1=new Student("Vishal Yadav","yadavvishal@gmail.com",202);
		Student student2=new Student("Anuj Dwivedi","anujdwivedi@gmail.com",203);
		
		Course course1=new Course("B-tech CSE",faculty1);
		
		course1.addStudent(student1);
		course1.addStudent(student2);
		course1.showCourseDetails();
		
	}
}
