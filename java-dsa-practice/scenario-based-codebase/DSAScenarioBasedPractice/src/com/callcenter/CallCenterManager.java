package com.callcenter;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class CallCenterManager {

	// creating a normal queue using linkedList
	private Queue<Customer> normalQueue = new LinkedList<Customer>();

	// creating a priority queue to store vip customer
	private PriorityQueue<Customer> vipQueue = new PriorityQueue<Customer>((c1, c2) -> c1.name.compareTo(c2.name));

	// creating hash map to store the call count
	HashMap<String, Integer> callCountMap = new HashMap<String, Integer>();

	// method to receive call
	public void receiveCall(Customer customer) {

		// add to appropriate queue
		if (customer.vIP) {
			vipQueue.offer(customer);
		} else {
			normalQueue.offer(customer);
		}

		// update all count
		callCountMap.put(customer.name, callCountMap.getOrDefault(customer, 0) + 1);
		System.out.println("Call received from : " + customer.name);

	}

	// method to answer call
	public void answerCall() {

		Customer customer;

		// VIP customers should handled first
		if (!vipQueue.isEmpty()) {
			customer = vipQueue.poll();
			System.out.println("Answered VIP call: " + customer.name);
		} else if (!normalQueue.isEmpty()) {
			customer = normalQueue.poll();
			System.out.println("Answered normal call: " + customer.name);
		} else {
			System.out.println("No calls in queue");
		}
	}

	// method to display customer calls details
	public void displayDetails() {
		System.out.println("\nCustomer Call Count");
		for (String name : callCountMap.keySet()) {
			System.out.println(name + " -> " + callCountMap.get(name));
		}
	}

}
