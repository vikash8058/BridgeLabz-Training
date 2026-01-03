package com.linkedlist.singly;

import java.util.Scanner;

public class StudentRecordManagement {

	// Node definition
	static class Node {
		int rollNumber;
		String name;
		int age;
		char grade;
		Node next;

		// constructor
		Node(int rollNumber, String name, int age, char grade) {
			this.rollNumber = rollNumber;
			this.name = name;
			this.age = age;
			this.grade = grade;
			this.next = null;
		}
	}

	// head pointer
	private Node head;

	// method to add at beginning
	public void addAtbeginning(int rollNumber, String name, int age, char grade) {
		Node newNode = new Node(rollNumber, name, age, grade);
		newNode.next = head;
		head = newNode;

		System.out.println("Student added at beginning");
	}

	// method to add end
	public void addAtEnd(int rollNumber, String name, int age, char grade) {
		Node newNode = new Node(rollNumber, name, age, grade);
		if (head == null) {
			head = newNode;
			System.out.println("Student added as first record");
			return;
		}

		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = newNode;
		System.out.println("Student added at ending");
	}
	
	//method to add at a specific position
	public void addAtPosition(int position,int rollNumber, String name, int age, char grade) {
		if(position<=0) {
			System.out.println("Invalid position");
			return;
		}
		if(position==1) {
			addAtbeginning(rollNumber, name, age, grade);
		}
		
		Node newNode = new Node(rollNumber, name, age, grade);
		Node temp=head;
		
		int count=0;
		while((count+1)!=position && temp!=null) {
			temp=temp.next;
		}
		
		if (temp==null) {
			System.out.println("Position out of range");
			return;
		}
		
		temp.next=newNode;
		System.out.println("Student added at position: "+position);
	}
	
	//method to delete student by roll number
	public void deleteByRollNumber(int rollNo) {
		
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		
		if(head.rollNumber==rollNo) {
			head=head.next;
			System.out.println("Student record deleted");
			return;
		}
		
		Node temp=head;
		while(temp.next!=null && temp.next.rollNumber!=rollNo ) {
			temp=temp.next;
		}
		
		if(temp.next==null) {
			System.out.println("Student not dound");
		}
		else {
			temp.next=temp.next.next;
			System.out.println("Student record deleted");
		}
	}
	
	//method to search student by roll number
	public void searchByRollNumber(int roll) {
        Node temp = head;

        while (temp != null) {
            if (temp.rollNumber == roll) {
                System.out.println("Student Found:");
                displayStudent(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }

    // Update Grade
    public void updateGrade(int roll, char newGrade) {
        Node temp = head;

        while (temp != null) {
            if (temp.rollNumber == roll) {
                temp.grade = newGrade;
                System.out.println("Grade updated successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }

    //Display All Students 
    public void displayAll() {
        if (head == null) {
            System.out.println("No student records available.");
            return;
        }

        Node temp = head;
        System.out.println("\n--- Student Records ---");
        while (temp != null) {
            displayStudent(temp);
            temp = temp.next;
        }
    }

   //Helper Method =====================
    private void displayStudent(Node node) {
        System.out.println(
                "Roll: " + node.rollNumber +
                ", Name: " + node.name +
                ", Age: " + node.age +
                ", Grade: " + node.grade
        );
    }

    //main method
    public static void main(String[] args) {
        StudentRecordManagement list = new StudentRecordManagement();
        Scanner input = new Scanner(System.in);

        list.addAtbeginning(101, "Rahul", 20, 'A');
        list.addAtEnd(102, "Priya", 21, 'B');
        list.addAtPosition(2, 103, "Amit", 19, 'A');

        list.displayAll();

        list.searchByRollNumber(102);
        list.updateGrade(102, 'A');
        list.deleteByRollNumber(101);

        list.displayAll();
        input.close();
    }
}	
	




























