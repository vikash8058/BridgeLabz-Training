/*
15. Rohan’s Library Reminder App 📚
Rohan wants a fine calculator:
● Input return date and due date.
● If returned late, calculate fine: ₹5/day.
● Repeat for 5 books using for-loop.
*/

import java.util.Scanner;

public class LibraryFineCalculator
{
	public static void main(String[] args)
	{
		// Create Scanner object
		Scanner input = new Scanner(System.in);

		int totalFine = 0;

		// Loop for 5 books
		for (int book = 1; book <= 5; book++)
		{
			System.out.println("\nBook " + book);

			// Take due date and return date
			System.out.print("Enter due date (day number): ");
			int dueDate = input.nextInt();

			System.out.print("Enter return date (day number): ");
			int returnDate = input.nextInt();

			// Check if book is returned late
			if (returnDate > dueDate)
			{
				int lateDays = returnDate - dueDate;
				int fine = lateDays * 5;

				System.out.println("Late by " + lateDays + " days");
				System.out.println("Fine for this book: $" + fine);

				totalFine = totalFine + fine;
			}
			else
			{
				System.out.println("Returned on time. No fine.");
			}
		}

		// Display total fine
		System.out.println("\nTotal Fine for all books: $" + totalFine);

		input.close(); //closing input stream
	}
}
