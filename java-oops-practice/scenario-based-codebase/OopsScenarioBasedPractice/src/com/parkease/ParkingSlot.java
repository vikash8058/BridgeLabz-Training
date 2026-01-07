package com.parkease;

import java.util.ArrayList;
import java.util.List;

// ParkingSlot class manages slot availability
public class ParkingSlot {

	private int slotId;
	private boolean isOccupied;
	private String vehicleTypeAllowed;

	// Internal booking records (private)
	private List<String> bookingLogs;

	// Constructor for slot initialization
	public ParkingSlot(int slotId, String vehicleTypeAllowed) {
		this.slotId = slotId;
		this.vehicleTypeAllowed = vehicleTypeAllowed;
		this.isOccupied = false;
		this.bookingLogs = new ArrayList<>();
	}

	// Assign slot internally
	public boolean assignSlot(Vehicle vehicle) {
		if (!isOccupied &&
			vehicle.getClass().getSimpleName().equalsIgnoreCase(vehicleTypeAllowed)) {

			isOccupied = true;
			bookingLogs.add("Slot " + slotId +
			                " booked for " + vehicle.vehicleNumber);
			return true;
		}
		return false;
	}

	// Release slot internally
	public void releaseSlot() {
		isOccupied = false;
		bookingLogs.add("Slot " + slotId + " released.");
	}

	// Read-only availability check
	public boolean isAvailable() {
		return !isOccupied;
	}

	// Expose booking logs safely
	public void showLogs() {
		System.out.println("\n--- Booking Logs ---");
		for (String log : bookingLogs) {
			System.out.println(log);
		}
	}
}
