package com.payexpress;

public class PayXpressApp {

	public static void main(String[] args) {

		IPayable electricity = new ElectricityBill(1200, "10-Feb-2026");
		IPayable water = new WaterBill(500, "12-Feb-2026");
		IPayable internet = new InternetBill(999, "15-Feb-2026");

		electricity.sendReminder();
		water.sendReminder();
		internet.sendReminder();

		System.out.println();

		electricity.pay(true);   // late payment
		water.pay(false);        // on-time payment
		internet.pay(true);      // late payment
	}
}
