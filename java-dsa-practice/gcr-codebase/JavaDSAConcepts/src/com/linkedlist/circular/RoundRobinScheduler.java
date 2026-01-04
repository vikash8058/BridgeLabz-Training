package com.linkedlist.circular;

public class RoundRobinScheduler {

	// defining Node
	static class Node {
		int processId;
		int burstTime;
		int remainingTime;
		int priority;
		Node next;

		// constructor to initializing
		public Node(int processId, int burstTime, int priority) {
			this.processId = processId;
			this.burstTime = burstTime;
			this.remainingTime = burstTime;
			this.priority = priority;
			this.next = null;
		}
	}

	// defining head
	private Node head;

	// method to add process at end
	public void addProcess(int processId, int burstTime, int priority) {
		Node newNode = new Node(processId, burstTime, priority);

		if (head == null) {
			head = newNode;
			newNode.next = head;
		} else {
			Node temp = head;
			while (temp.next != head) {
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.next = head;
		}

		System.out.println("Process added: P" + processId);
	}

	// method to remove process by process id
	private void removeProcess(Node prev, Node curr) {

		if (curr == head && curr.next == head) {
			head = null;
			return;
		}

		if (curr == head) {
			Node temp = head;
			while (temp.next != head) {
				temp = temp.next;
			}
			head = head.next;
			temp.next = head;
		} else {
			prev.next = curr.next;
		}
	}

	// method to display all processes
	public void displayProcesses() {

		if (head == null) {
			System.out.println("No processes in queue");
			return;
		}

		Node temp = head;
		System.out.println("\nCurrent Process Queue:");

		do {
			System.out.println("Process ID: P" + temp.processId + ", Remaining Time: " + temp.remainingTime
					+ ", Priority: " + temp.priority);
			temp = temp.next;
		} while (temp != head);
	}

	// method to simulate round robin scheduling
	public void simulateScheduling(int timeQuantum) {

		if (head == null) {
			System.out.println("No processes to schedule");
			return;
		}

		int totalTime = 0;
		int totalWaitingTime = 0;
		int totalTurnAroundTime = 0;
		int completedProcesses = 0;

		Node curr = head;
		Node prev = null;

		while (head != null) {

			if (curr.remainingTime > 0) {

				if (curr.remainingTime > timeQuantum) {
					curr.remainingTime -= timeQuantum;
					totalTime += timeQuantum;
				} else {
					totalTime += curr.remainingTime;
					curr.remainingTime = 0;

					int turnAroundTime = totalTime;
					int waitingTime = turnAroundTime - curr.burstTime;

					totalWaitingTime += waitingTime;
					totalTurnAroundTime += turnAroundTime;
					completedProcesses++;

					System.out.println("Process P" + curr.processId + " completed");

					removeProcess(prev, curr);
					curr = (prev == null) ? head : prev.next;
					displayProcesses();
					continue;
				}
			}

			prev = curr;
			curr = curr.next;
			displayProcesses();
		}

		System.out.println("\nScheduling Completed");
		System.out.println("Average Waiting Time: " + (double) totalWaitingTime / completedProcesses);
		System.out.println("Average Turnaround Time: " + (double) totalTurnAroundTime / completedProcesses);
	}

	public static void main(String[] args) {

		RoundRobinScheduler scheduler = new RoundRobinScheduler();

		scheduler.addProcess(1, 10, 1);
		scheduler.addProcess(2, 5, 2);
		scheduler.addProcess(3, 8, 1);
		scheduler.addProcess(4, 6, 3);

		scheduler.displayProcesses();

		System.out.println("\nStarting Round Robin Scheduling\n");
		scheduler.simulateScheduling(3);
	}
}
