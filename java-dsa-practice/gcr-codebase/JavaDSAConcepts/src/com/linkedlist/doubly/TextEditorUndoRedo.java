package com.linkedlist.doubly;

public class TextEditorUndoRedo {

	// defining Node
	static class Node {
		String textState;
		Node next;
		Node prev;

		// constructor to initializing
		public Node(String textState) {
			this.textState = textState;
			this.next = null;
			this.prev = null;
		}
	}

	// defining head, tail and current pointer
	private Node head;
	private Node tail;
	private Node current;

	// maximum history size
	private int maxSize = 10;
	private int size = 0;

	// method to add new text state
	public void addState(String text) {

		Node newNode = new Node(text);

		// if no state exists
		if (head == null) {
			head = tail = current = newNode;
			size++;
			return;
		}

		// remove redo history if exists
		if (current.next != null) {
			current.next.prev = null;
			current.next = null;
			tail = current;
			size = calculateSize();
		}

		// add new state at end
		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
		current = newNode;
		size++;

		// maintain history limit
		if (size > maxSize) {
			head = head.next;
			head.prev = null;
			size--;
		}

		System.out.println("New state added");
	}

	// method to undo last action
	public void undo() {

		if (current == null || current.prev == null) {
			System.out.println("No undo available");
			return;
		}

		current = current.prev;
		System.out.println("Undo performed");
	}

	// method to redo last undone action
	public void redo() {

		if (current == null || current.next == null) {
			System.out.println("No redo available");
			return;
		}

		current = current.next;
		System.out.println("Redo performed");
	}

	// method to display current text state
	public void displayCurrentState() {

		if (current == null) {
			System.out.println("Editor is empty");
			return;
		}

		System.out.println("Current Text: " + current.textState);
	}

	// helper method to calculate size
	private int calculateSize() {

		int count = 0;
		Node temp = head;

		while (temp != null) {
			count++;
			temp = temp.next;
		}

		return count;
	}

	public static void main(String[] args) {

		TextEditorUndoRedo editor = new TextEditorUndoRedo();

		editor.addState("Hello");
		editor.displayCurrentState();

		editor.addState("Hello World");
		editor.displayCurrentState();

		editor.addState("Hello World!");
		editor.displayCurrentState();

		editor.undo();
		editor.displayCurrentState();

		editor.undo();
		editor.displayCurrentState();

		editor.redo();
		editor.displayCurrentState();

		editor.addState("Hello Java");
		editor.displayCurrentState();

		editor.redo(); // should not work
	}
}
