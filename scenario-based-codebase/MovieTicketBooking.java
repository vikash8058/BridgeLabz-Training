/*
14. Movie Ticket Booking App 🎬
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names.
*/

import java.util.Scanner;

public class MovieTicketBooking
{
	public static void main(String[] args)
	{
		// Create Scanner object
		Scanner input = new Scanner(System.in);

		// Variable to control multiple customers
		char nextCustomer = 'Y';

		// Loop for multiple customers
		while (nextCustomer == 'Y' || nextCustomer == 'y')
		{
			int moviePrice = 0;
			int seatPrice = 0;
			int snackPrice = 0;
			int totalAmount = 0;

			// Display movie menu
			System.out.println("\n--- Movie Menu ---");
			System.out.println("1. Action Movie");
			System.out.println("2. Comedy Movie");
			System.out.println("3. Horror Movie");
			System.out.print("Choose movie type: ");
			int movieChoice = input.nextInt();

			// Movie price selection
			switch (movieChoice)
			{
				case 1 -> moviePrice = 200;
			
				case 2 -> moviePrice = 180;
					

				case 3 -> moviePrice = 220;
				
				default ->{
					System.out.println("Invalid movie choice");
					continue;
				}
			}

			// Seat type selection
			System.out.print("Choose seat type (Gold/Silver): ");
			String seatType = input.next();

			if (seatType.equalsIgnoreCase("Gold"))
			{
				seatPrice = 100;
			}
			else if (seatType.equalsIgnoreCase("Silver"))
			{
				seatPrice = 50;
			}
			else
			{
				System.out.println("Invalid seat type");
				continue;
			}

			// Snacks selection
			System.out.print("Do you want snacks? (Yes/No): ");
			String snacksChoice = input.next();

			if (snacksChoice.equalsIgnoreCase("Yes"))
			{
				snackPrice = 80;
			}

			// Calculate total amount
			totalAmount = moviePrice + seatPrice + snackPrice;

			// Display bill
			System.out.println("\n--- Booking Summary ---");
			System.out.println("Movie Price : $" + moviePrice);
			System.out.println("Seat Price  : $" + seatPrice);
			System.out.println("Snacks Cost : $" + snackPrice);
			System.out.println("Total Bill  : $" + totalAmount);

			// Ask for next customer
			System.out.print("\nNext customer? (Y/N): ");
			nextCustomer = input.next().charAt(0);
		}

		System.out.println("\nThank you for using Movie Ticket Booking App ");
		input.close(); //closing input stream
	}
}
