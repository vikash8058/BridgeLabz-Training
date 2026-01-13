package com.parceltracker;

public class ParcelTracker {

	private Stage head;

	// add initial stage
	public void addStage(String name) {
		Stage newStage = new Stage(name);
		if (head == null) {
			head = newStage;
		} else {
			Stage temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newStage;
		}
	}

	// add custom intermediate checkpoint after a given stage
	public void addCheckPoint(String afterStage, String newStageName) {
		Stage temp = head;
		while (temp != null) {
			if (temp.name.equalsIgnoreCase(afterStage)) {
				Stage newStage = new Stage(newStageName);
				newStage.next = temp.next;
				temp.next = newStage;

				System.out.println("Checkpoint added: " + newStageName);
				return;
			}
			temp = temp.next;
		}

		System.out.println("Stage not found: " + afterStage);
	}

	// track parcel through stages
	public void trackParcel() {
		if (head == null) {
			System.out.println("No tracking information available.");
			return;
		}

		Stage temp = head;
		System.out.println("Parcel Tracking:");

		while (temp != null) {
			System.out.print("→ " + temp.name);
			temp = temp.next;
		}

		System.out.println("\nTracking ended.");
	}

	// simulate lost parcel by breaking the chain
	public void markParcelLost(String stageName) {

		Stage temp = head;

		while (temp != null) {

			if (temp.name.equalsIgnoreCase(stageName)) {
				temp.next = null;
				System.out.println("Parcel lost after stage: " + stageName);
				return;
			}

			temp = temp.next;
		}

		System.out.println("Stage not found: " + stageName);
	}
}
