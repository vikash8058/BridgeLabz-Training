package com.hashmaphashfunctions;


public class CustomHashMap {

	// Node class for Linked List
	static class Node {
		int key;
		int value;
		Node next;

		Node(int key, int value) {
			this.key = key;
			this.value = value;
		}
	}

	private int capacity = 10; // size of hash table
	private Node[] table;

	// Constructor
	public CustomHashMap() {
		table = new Node[capacity];
	}

	// Hash function
	private int hash(int key) {
		return key % capacity;
	}

	// Insert or Update key-value pair
	public void put(int key, int value) {

		int index = hash(key);
		Node head = table[index];

		// Check if key already exists
		Node current = head;
		while (current != null) {
			if (current.key == key) {
				current.value = value; // update
				return;
			}
			current = current.next;
		}

		// Insert new node at beginning
		Node newNode = new Node(key, value);
		newNode.next = head;
		table[index] = newNode;
	}

	// Retrieve value by key
	public Integer get(int key) {

		int index = hash(key);
		Node current = table[index];

		while (current != null) {
			if (current.key == key) {
				return current.value;
			}
			current = current.next;
		}

		return null; // key not found
	}

	// Remove key-value pair
	public void remove(int key) {

		int index = hash(key);
		Node current = table[index];
		Node prev = null;

		while (current != null) {
			if (current.key == key) {
				if (prev == null) {
					table[index] = current.next;
				} else {
					prev.next = current.next;
				}
				return;
			}
			prev = current;
			current = current.next;
		}
	}

	// Display HashMap
	public void display() {

		for (int i = 0; i < capacity; i++) {
			System.out.print("Bucket " + i + ": ");
			Node current = table[i];

			while (current != null) {
				System.out.print("[" + current.key + "=" + current.value + "] ");
				current = current.next;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		CustomHashMap map = new CustomHashMap();

		map.put(1, 10);
		map.put(11, 20); // collision with key 1
		map.put(2, 30);

		System.out.println("Value for key 1: " + map.get(1));
		System.out.println("Value for key 11: " + map.get(11));

		map.remove(1);

		System.out.println("\nAfter removing key 1:");
		map.display();
	}
}
