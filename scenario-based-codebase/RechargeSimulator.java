/*
10. Phone Recharge Simulator 📱
Take the user's mobile operator and amount.
● Use a switch to display offers.
● Loop to allow repeated recharges.
● Show balance after each recharge.
*/

import java.util.Scanner;

public class RechargeSimulator{
	public static void main(String[] args){
		
		//creating Scanner object
		Scanner input=new Scanner(System.in);
		
		double balance=0.0;
		boolean continueRecharge=true;
		
		while(continueRecharge){
			//taking operator input
			System.out.println("\\\tChoose your operator\\\t");
			System.out.println("\n1. Jio \n2. Airtel  \n3.VI");
			System.out.println("Enter your choice: ");
			int operatorChoice=input.nextInt();
			
			switch(operatorChoice){
				case 1 -> System.out.println("Jio offer: 1.5GB/day + unlimited calling ");
				case 2 -> System.out.println("Airtel offer: 2GB/day + unlimited calling ");
				case 3 -> System.out.println("VI offer: 2.5GB/day + unlimited calling ");
				default -> System.out.println("Invalid operator selected!!!");
			}
			//taking recharge amount as input
			System.out.print("Enter recharge amount: ");
			int amount=input.nextInt();
			
			balance+=amount;
		
			//showing updated balance
			System.out.println("Recharge Successfull!!");
			System.out.println("current balance: "+balance);
			
			//asking user to continue or exit
			System.out.println("\ndo you want to recharge again? (yes/no): ");
			String choice=input.next();
			
			if(!choice.equalsIgnoreCase("yes")){
				continueRecharge=false;
			}
		}
		
		input.close(); //closing input stream
	}
}