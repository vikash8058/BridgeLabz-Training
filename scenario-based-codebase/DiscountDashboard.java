/*
8. Shopkeeper’s Discount Dashboard 🛍️
A shopkeeper gives discounts based on total bill:
● Input item prices in a for-loop.
● Use if-else for discount logic.
● Use proper indentation, constants, and comments.
*/

import java.util.Scanner;

public class DiscountDashboard{
	public static void main(String[] args){
		
		//creating Scanner object
		Scanner input=new Scanner(System.in);
		
		//get the number of items from user
		System.out.print("Enter the number of items: ");
		int numberOfItems=input.nextInt();
		
		//create an array to store the prices of items
		double[] prices=new double[numberOfItems];
		
		System.out.println("Enter the prices: ");
		for(int i=0;i<prices.length;i++){
			System.out.println("Enter the price of "+(i+1)+" item: ");
			prices[i]=input.nextDouble();
		}
		
		double totalBill=0.0; //initialize total bill from 0		
		
		for(int i=0;i<prices.length;i++){
			double price=prices[i];
			if(price>=750 && price<=1000){
				double discount=price*0.20;         //20% discount for item which is in between 750 to 1000
				price-=discount;
				System.out.println("Discount for "+prices[i]+" is : "+discount+" so the item would be in "+price);
				totalBill+=price;
			}
			else if(price>=600 && price<750){
				double discount=price*0.15;       //15% discount for item which is in between 600 to 750
				price-=discount;
				System.out.println("Discount for "+prices[i]+" is : "+discount+" so the item would be in "+price);
				totalBill+=price;
			}
			else if(price>=450 && price<600){ 
				double discount=price*0.10;      //10% discount for item which is in between 450 to 600
				price-=discount;
				System.out.println("Discount for "+prices[i]+" is : "+discount+" so the item would be in "+price);
				totalBill+=price;
			}
			else{    
				//No discount for item which is under 450
				System.out.println("No discount for items which is under 450");
				System.out.println("And the price for this particular item is : "+price);
				totalBill+=price;
			}
		}
		
		System.out.println("Total bill woould be : "+totalBill ); //displaying total bill 
		
		input.close(); //closing input stream
	}
}