//program to calculate coffee bill and serve multiple customers
import java.util.Scanner;

public class CoffeeCounterChronicles {
	
	public static void main(String[] args) {
		//create Scanner object
		Scanner input = new Scanner(System.in);
		
		//variable to control loop
		String choice="";
		
		//serve customer until user types exit
		while(true) {
			
			//get coffee type
			System.out.print("Enter coffee type (Espresso/Latte/Capuccino) or exit: ");
			choice=input.nextLine();
			
			//check for exit condition
			//check for exit condition
			if(choice.equalsIgnoreCase("exit")) {
			    System.out.println("Thank you for visiting Vishal's Cafe!");
			    break;
			}
			
			//get quantity
			System.out.print("Enter quantity: ");
			int quantity=input.nextInt();
			input.nextLine(); //consume new Line
			
			double price=0;
			
			//select price using switch
			switch(choice) {
				case "Espresso" :
					price=120;
					break;
				
				case "Latte":
					price=150;
					break;
				
				case "Cappuccino" :
					price=180;
					break;
					
				default:
					System.out.println("Invlaid Coffee type");
					continue;
			}
			
			//calculate bill 
			double bill=price*quantity;
			
			//calculate GST(5%)
			double gst=bill*0.05;
			
			//calculate total amount
			double total=bill+gst;
			
			//display bill details
			System.out.println("Bill Amount: "+bill);
			System.out.println("GST: "+gst);
			System.out.println("Total Payable Amount: "+total);
			System.out.println();
		}

		input.close(); //closing input stream
	}

}
