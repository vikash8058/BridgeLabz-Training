//program to manage metro smart card fare deduction
import java.util.Scanner;

public class MetroSmartCard
{
	public static void main(String[] args)
	{
		//create Scanner object
		Scanner input=new Scanner(System.in);

		//initial balance
		double balance=200;

		while(balance>0)
		{
			//get travel distance
			System.out.print("Enter distance in km (or 0 to exit): ");
			int distance=input.nextInt();

			//exit condition
			if(distance==0)
			{
				break;
			}

			//calculate fare using ternary operator
			double fare = distance<=5 ? 10 :
				      distance<=10 ? 20 :
				      distance<=20 ? 30 : 40;

			//check balance
			if(balance>=fare)
			{
				balance=balance-fare;
				System.out.println("Fare deducted: "+fare);
				System.out.println("Remaining balance: "+balance);
			}
			else
			{
				System.out.println("Insufficient balance.");
				break;
			}

			System.out.println();
		}

		System.out.println("Thank you for using Metro Service.");

		input.close(); //closing input stream
	}
}
