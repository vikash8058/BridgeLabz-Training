package com.traincompanion;

public class TrainManager {

	private Compartment head;
	private Compartment tail;
	private Compartment current;

	// method to add compartment at the end
	public void addCompartment(String name) {

		// create a node by passing value into Compartment
		Compartment newCompartment = new Compartment(name);
		if (head == null) {
			head = tail = newCompartment;
			current = head;
		} else {
			tail.next = newCompartment;
			newCompartment.prev = tail;
			tail = newCompartment;
		}
	}

	// method to move next compartment
	public void moveForward() {
		if (current != null && current.next != null) {
			current = current.next;
			System.out.println("moved to: " + current.name);
		} else {
			System.out.println("No next compartment is available");
		}
	}

	// method to move previous compartment
	public void moveBackward() {
		if (current != null && current.prev != null) {
			current = current.prev;
			System.out.println("moved to: " + current.name);
		} else {
			System.out.println("No previous compartment is available");
		}
	}

	// remove a compartment dynamically
	public void removeCompartment(String name) {
		if (head == null) {
			return;
		}
		Compartment temp = head;
		while (temp != null) {
			if (temp.name.equalsIgnoreCase(name)) {

				// removing head
				if (temp == head) {
					head = temp.next;
					if (head != null) {
						head.prev = null;
					}
				}

				// removing tail
				else if (temp == tail) {
					tail = temp.prev;
					tail.next = null;
				}

				// removing middle Compartment
				else {
					temp.prev.next = temp.next;
					temp.next.prev = temp.prev;
				}

				// adjust current if needed
				if (current == temp) {
					current = head;
				}

				System.out.println(name + ": Compartment removed ");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Compartment not found");
	}

	// method to display adjacent compartments
	public void displayAdjacent() {
		if (current == null) {
			System.out.println("No current compartment.");
			return;
		}

		System.out.println("Current Compartment: " + current.name);

		if (current.prev != null) {
			System.out.println("Previous Compartment: " + current.prev.name);
		} else {
			System.out.println("Previous Compartment: None");
		}

		if (current.next != null) {
			System.out.println("Next Compartment: " + current.next.name);
		} else {
			System.out.println("Next Compartment: None");
		}
	}
}
