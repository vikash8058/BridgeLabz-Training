package com.linkedlist.circular;

public class TaskScheduler {

	// defining Node
	static class Node {
		int taskId;
		String taskName;
		String priority;
		String dueDate;
		Node next;

		// constructor to initializing
		public Node(int taskId, String taskName, String priority, String dueDate) {
			this.taskId = taskId;
			this.taskName = taskName;
			this.priority = priority;
			this.dueDate = dueDate;
			this.next = null;
		}
	}

	// defining head and current
	private Node head;
	private Node current;

	// method to add task at beginning
	public void addAtBeginning(int taskId, String taskName, String priority, String dueDate) {
		Node newNode = new Node(taskId, taskName, priority, dueDate);

		if (head == null) {
			head = newNode;
			newNode.next = head;
			current = head;
		} else {
			Node temp = head;
			while (temp.next != head) {
				temp = temp.next;
			}
			newNode.next = head;
			temp.next = newNode;
			head = newNode;
		}

		System.out.println("Task added at beginning");
	}

	// method to add task at ending
	public void addAtEnd(int taskId, String taskName, String priority, String dueDate) {
		Node newNode = new Node(taskId, taskName, priority, dueDate);

		if (head == null) {
			head = newNode;
			newNode.next = head;
			current = head;
		} else {
			Node temp = head;
			while (temp.next != head) {
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.next = head;
		}

		System.out.println("Task added at end");
	}

	// method to add task at specific position
	public void addAtPosition(int position, int taskId, String taskName, String priority, String dueDate) {

		if (position <= 0) {
			System.out.println("Invalid position");
			return;
		}

		if (position == 1) {
			addAtBeginning(taskId, taskName, priority, dueDate);
			return;
		}

		Node newNode = new Node(taskId, taskName, priority, dueDate);
		Node temp = head;
		int count = 1;

		while (count < position - 1 && temp.next != head) {
			temp = temp.next;
			count++;
		}

		newNode.next = temp.next;
		temp.next = newNode;

		System.out.println("Task added at position: " + position);
	}

	// method to remove task by task id
	public void removeByTaskId(int taskId) {

		if (head == null) {
			System.out.println("Task list is empty");
			return;
		}

		Node temp = head;
		Node prev = null;

		// if head needs to be removed
		if (head.taskId == taskId) {

			if (head.next == head) {
				head = current = null;
			} else {
				while (temp.next != head) {
					temp = temp.next;
				}
				temp.next = head.next;
				head = head.next;
				current = head;
			}

			System.out.println("Task removed with ID: " + taskId);
			return;
		}

		prev = head;
		temp = head.next;

		while (temp != head) {
			if (temp.taskId == taskId) {
				prev.next = temp.next;
				System.out.println("Task removed with ID: " + taskId);
				return;
			}
			prev = temp;
			temp = temp.next;
		}

		System.out.println("Task not found");
	}

	// method to view current task and move to next
	public void viewNextTask() {

		if (current == null) {
			System.out.println("No tasks available");
			return;
		}

		displayTask(current);
		current = current.next;
	}

	// method to display all tasks
	public void displayAllTasks() {

		if (head == null) {
			System.out.println("No tasks available");
			return;
		}

		Node temp = head;
		System.out.println("\nTask List:");

		do {
			displayTask(temp);
			temp = temp.next;
		} while (temp != head);
	}

	// method to search task by priority
	public void searchByPriority(String priority) {

		if (head == null) {
			System.out.println("No tasks available");
			return;
		}

		Node temp = head;
		boolean found = false;

		do {
			if (temp.priority.equalsIgnoreCase(priority)) {
				displayTask(temp);
				found = true;
			}
			temp = temp.next;
		} while (temp != head);

		if (!found) {
			System.out.println("No tasks found with priority: " + priority);
		}
	}

	// Helper Method
	private void displayTask(Node node) {
		System.out.println("Task ID: " + node.taskId + ", Name: " + node.taskName + ", Priority: " + node.priority
				+ ", Due Date: " + node.dueDate);
	}

	public static void main(String[] args) {

		TaskScheduler scheduler = new TaskScheduler();

		scheduler.addAtBeginning(1, "Design Module", "High", "10-01-2026");
		scheduler.addAtEnd(2, "Implement Feature", "Medium", "12-01-2026");
		scheduler.addAtEnd(3, "Testing", "Low", "15-01-2026");
		scheduler.addAtPosition(2, 4, "Code Review", "High", "11-01-2026");

		scheduler.displayAllTasks();

		System.out.println("\nViewing tasks in circular manner:");
		scheduler.viewNextTask();
		scheduler.viewNextTask();
		scheduler.viewNextTask();

		System.out.println("\nSearch tasks by priority:");
		scheduler.searchByPriority("High");

		scheduler.removeByTaskId(2);
		scheduler.displayAllTasks();
	}
}
