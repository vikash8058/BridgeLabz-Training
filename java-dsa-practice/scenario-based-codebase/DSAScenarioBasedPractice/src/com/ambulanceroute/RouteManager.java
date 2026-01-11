package com.ambulanceroute;

public class RouteManager {

	private HospitalUnit head;
	private HospitalUnit tail;

	// method to add hospital unit in circular linked list
	public void addUnit(String unitName, boolean available) {

		HospitalUnit newUnit = new HospitalUnit(unitName, available);

		if (head == null) {
			head = newUnit;
			tail = newUnit;
			tail.next = head;
		} else {
			tail.next = newUnit;
			tail = newUnit;
			tail.next = head;
		}
	}

	// method to rotate through units and find available one
	public void findAvailableUnit() {

		if (head == null) {
			System.out.println("No hospital units available.");
			return;
		}

		HospitalUnit temp = head;

		do {
			if (temp.available) {
				System.out.println("Patient redirected to: " + temp.unitName);
				return;
			}
			temp = temp.next;
		} while (temp != head);

		System.out.println("No unit available for emergency.");
	}

	// method to remove unit under maintenance
	public void removeUnit(String unitName) {

		if (head == null) {
			return;
		}

		HospitalUnit current = head;
		HospitalUnit previous = tail;

		do {
			if (current.unitName.equalsIgnoreCase(unitName)) {

				// single node case
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

				System.out.println(unitName + " removed (under maintenance).");
				return;
			}

			previous = current;
			current = current.next;

		} while (current != head);

		System.out.println("Unit not found: " + unitName);
	}
}
