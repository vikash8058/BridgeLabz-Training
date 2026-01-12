package com.callcenter;

public class CallCenterApp {
	public static void main(String[] args) {

		// creating object of
		CallCenterManager manager = new CallCenterManager();

		Customer customer1 = new Customer("Vishal", true);
		Customer customer2 = new Customer("Vikash", false);
		Customer customer3 = new Customer("Virendra", false);
		Customer customer4 = new Customer("Sakshi", true);
		Customer customer5 = new Customer("Anuj", false);
		Customer customer6 = new Customer("Anupam", false);
		Customer customer7 = new Customer("Utkarsh", true);

		// received calls
		manager.receiveCall(customer1);
		manager.receiveCall(customer2);
		manager.receiveCall(customer3);
		manager.receiveCall(customer4);
		manager.receiveCall(customer5);
		manager.receiveCall(customer6);
		manager.receiveCall(customer7);

		System.out.println("-----------------------------------------");
		
		// answered calls
		manager.answerCall();
		manager.answerCall();
		manager.answerCall();
		manager.answerCall();
		manager.answerCall();
		manager.answerCall();
		manager.answerCall();
		manager.answerCall();
		manager.answerCall();

		System.out.println("-----------------------------------------");
		
		// display statistics
		manager.displayDetails();
	}
}
