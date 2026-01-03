package com.linkedlist.singly;

public class InventoryManagementSystem {

	// define node
	static class Node {

		int itemId;
		String itemName;
		int quantity;
		double price;
		Node next;

		// constructor
		Node(int itemId, String itemName, int quantity, double price) {
			this.itemId = itemId;
			this.itemName = itemName;
			this.quantity = quantity;
			this.price = price;
			this.next = null;
		}
	}

	// head pointer
	private static Node head;

	// method to add an item at the beginning
	public void addAtBeginning(int itemId, String itemName, int quantity, double price) {
		Node newNode = new Node(itemId, itemName, quantity, price);
		newNode.next = head;
		head = newNode;

		System.out.println("Inventory added at beginning");
	}

	// method to add at end
	public void addAtEnd(int itemId, String itemName, int quantity, double price) {
		Node newNode = new Node(itemId, itemName, quantity, price);
		if (head == null) {
			head = newNode;
			System.out.println("Inventory added as first record");
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = newNode;
		System.out.println("Inventory added at last position");
	}

	// method to add an item at specific position
	public void addAtSpecificPostion(int position, int itemId, String itemName, int quantity, double price) {
		Node newNode = new Node(itemId, itemName, quantity, price);

		if (position <= 0) {
			System.out.println("Invalid position");
			return;
		}

		if (position == 1) {
			addAtBeginning(itemId, itemName, quantity, price);
			return;
		}

		Node temp = head;
		int count = 1;
		while ((count < position - 1) && temp != null) {
			temp = temp.next;
			count++;
		}

		if (temp == null) {
			System.out.println("Position out of range");
		}

		newNode.next = temp.next;
		temp.next = newNode;
		System.out.println("Inventory added at position: " + position);
	}

	// method to remove item by itemId
	public void removeItemByItemId(int itemID) {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		if (head.itemId == itemID) {
			head = head.next;
			System.out.println("Inventory record deleted");
			return;
		}

		Node temp = head;
		while (temp.next != null && temp.next.itemId != itemID) {
			temp = temp.next;
		}

		if (temp.next == null) {
			System.out.println("Inventory not found");
		} else {
			temp.next = temp.next.next;
			System.out.println("Inventory record deleted ");
		}
	}

	// method to update the quantity of item by itemID
	public void updateQuantity(int itemID, int newQuantity) {

		Node temp = head;
		while (temp != null) {
			if (temp.itemId == itemID) {
				temp.quantity = newQuantity;
				System.out.println("new quantity updated");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Inventory not found");
	}

	// method to search inventory by itemId
	public void searchInventory(int itemID) {
		Node temp = head;
		while (temp != null) {
			if (temp.itemId == itemID) {
				System.out.println("Inventory Found");
				displayInventory(temp);
				return;
			}
			temp = temp.next;
		}
		System.out.println("Inventory not found");
	}

	// method to display all record
	public void displayAll() {
		Node temp = head;
		if (temp == null) {
			System.out.println("No record found");
			return;
		}
		while (temp != null) {
			displayInventory(temp);
			temp = temp.next;
		}
	}

	// method to display a single inventory
	public void displayInventory(Node node) {
		System.out.println("Item Id: " + node.itemId + ", item name: " + node.itemName + ", quantity: " + node.quantity
				+ ", price: " + node.price);
	}

	// method to calculate total value
	public void calculateValue() {
		Node temp = head;
		double sum = 0;
		while (temp != null) {
			sum += temp.price * temp.quantity;
			temp = temp.next;
		}
		System.out.println("The total value of inventories is: " + sum);
	}

	// method to sort inventory by price in ascending order using merge sort
	public void sortByPriceAscending() {
		head = mergeSortPriceAscending(head);
	}

	// helper method: merge sort (price ascending)
	private Node mergeSortPriceAscending(Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node middle = getMiddle(head);
		Node nextOfMiddle = middle.next;
		middle.next = null;

		Node left = mergeSortPriceAscending(head);
		Node right = mergeSortPriceAscending(nextOfMiddle);

		return mergePriceAscending(left, right);
	}

	// merge two sorted lists (price ascending)
	private Node mergePriceAscending(Node a, Node b) {
		if (a == null)
			return b;
		if (b == null)
			return a;

		if (a.price <= b.price) {
			a.next = mergePriceAscending(a.next, b);
			return a;
		} else {
			b.next = mergePriceAscending(a, b.next);
			return b;
		}
	}

	// method to sort inventory by price in descending order using merge sort
	public void sortByPriceDescending() {
		head = mergeSortPriceDescending(head);
	}

	// helper method: merge sort (price descending)
	private Node mergeSortPriceDescending(Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node middle = getMiddle(head);
		Node nextOfMiddle = middle.next;
		middle.next = null;

		Node left = mergeSortPriceDescending(head);
		Node right = mergeSortPriceDescending(nextOfMiddle);

		return mergePriceDescending(left, right);
	}

	// merge two sorted lists (price descending)
	private Node mergePriceDescending(Node a, Node b) {
		if (a == null)
			return b;
		if (b == null)
			return a;

		if (a.price >= b.price) {
			a.next = mergePriceDescending(a.next, b);
			return a;
		} else {
			b.next = mergePriceDescending(a, b.next);
			return b;
		}
	}

	// method to find middle of the linked list
	private Node getMiddle(Node head) {
		if (head == null)
			return head;

		Node slow = head;
		Node fast = head.next;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
	}

	// main method
	public static void main(String[] args) {

		InventoryManagementSystem list = new InventoryManagementSystem();
		list.addAtBeginning(101, "Steel", 5, 5000);
		list.addAtBeginning(100, "Wood", 2, 10200);
		list.displayAll();

		list.addAtEnd(102, "Glass", 3, 3000);
		list.displayAll();

		list.updateQuantity(102, 8);
		list.displayAll();

		// list.displayInventory(head);
		list.removeItemByItemId(101);
		list.displayAll();

		list.addAtSpecificPostion(2, 104, "Gold", 2, 140000);
		list.displayAll();
		list.calculateValue();
		
		list.sortByPriceAscending();
		list.displayAll();
		
		list.sortByPriceDescending();
		list.displayAll();
	}
}
