/*
12. Train Reservation Queue 🚆
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once seats reach zero (break).
*/

import java.util.Scanner;

public class TrainReservation{
	public static void main(String[] args){
		
		//creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//total number of seat 
		int totalSeats=7;
		
		System.out.println("\tWelcome to Rail Ticket Booking System\t");
		System.out.println("Total Seats available for booking: "+totalSeats);
		System.out.println("1. Book Ticket");
		System.out.println("2. Exit");
		
		boolean hasSeat=true;
		while(hasSeat){
			System.out.print("Enter your choice: ");
			int choice=input.nextInt();
			
			switch(choice){
				case 1 ->{
					if(totalSeats>0){
						System.out.println("Your ticket has been successfully booked!!!");
						totalSeats--;
						System.out.println("Total Seats available for booking: "+totalSeats);
					}
					else{
						System.out.println("Sorry...There is no seats are available for booking");
						hasSeat=false;
						break;
					}
				}
				case 2 -> {
					System.out.println("Exiting from the application.....");
					System.exit(0);
				}
				default -> System.out.println("Incorrect choice!!! Please choose the right option...");
			}
		}
		
		System.out.println("Thank you for visiting to our application....");
		
		input.close(); // closing the input stream
	}
}