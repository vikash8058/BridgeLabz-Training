package com.trafficmanager;

import java.util.LinkedList;
import java.util.Queue;

public class TrafficManager {

	private Vehicle head;
	private Vehicle tail;

	private Queue<Vehicle> waitingQueue = new LinkedList<>();

	private int maxCapacity = 3; // max vehicles allowed in roundabout
	private int currentCount = 0;

	// add vehicle to roundabout or queue
	public void enterVehicle(String number) {

		Vehicle vehicle = new Vehicle(number);

		if (currentCount < maxCapacity) {
			addToRoundabout(vehicle);
			System.out.println(number + " entered roundabout.");
		} else {
			waitingQueue.offer(vehicle);
			System.out.println(number + " added to waiting queue.");
		}
	}

	// internal method to add vehicle in circular linked list
	private void addToRoundabout(Vehicle vehicle) {

		if (head == null) {
			head = vehicle;
			tail = vehicle;
			tail.next = head;
		} else {
			tail.next = vehicle;
			tail = vehicle;
			tail.next = head;
		}

		currentCount++;
	}

	// remove a vehicle from roundabout
	public void exitVehicle(String number) {

		if (head == null) {
			System.out.println("Roundabout is empty.");
			return;
		}

		Vehicle current = head;
		Vehicle previous = tail;

		do {
			if (current.number.equalsIgnoreCase(number)) {

				// single vehicle case
				if (head == tail) {
					head = null;
					tail = null;
				} else {
					previous.next = current.next;

					if (current == head) {
						head = current.next;
						tail.next = head;
					}

					if (current == tail) {
						tail = previous;
						tail.next = head;
					}
				}

				currentCount--;
				System.out.println(number + " exited roundabout.");

				// move vehicle from queue if available
				if (!waitingQueue.isEmpty()) {
					Vehicle nextVehicle = waitingQueue.poll();
					addToRoundabout(nextVehicle);
					System.out.println(nextVehicle.number + " moved from queue to roundabout.");
				}

				return;
			}

			previous = current;
			current = current.next;

		} while (current != head);

		System.out.println("Vehicle not found in roundabout.");
	}

	// display roundabout state
	public void displayRoundabout() {

		if (head == null) {
			System.out.println("Roundabout is empty.");
			return;
		}

		System.out.print("Roundabout: ");

		Vehicle temp = head;
		do {
			System.out.print(temp.number + " → ");
			temp = temp.next;
		} while (temp != head);

		System.out.println("(back to " + head.number + ")");
	}
}
