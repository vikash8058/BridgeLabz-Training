package com.parceltracker;

public class ParcelTrackerApp {

	public static void main(String[] args) {

		ParcelTracker tracker = new ParcelTracker();

		// initial delivery stages
		tracker.addStage("Packed");
		tracker.addStage("Shipped");
		tracker.addStage("In Transit");
		tracker.addStage("Delivered");

		// add custom checkpoint
		tracker.addCheckPoint("Shipped", "At Warehouse");

		// track parcel
		tracker.trackParcel();

		System.out.println();

		// simulate lost parcel
		tracker.markParcelLost("In Transit");

		// track again
		tracker.trackParcel();
	}
}
