//program to find out Simple Interest using method
import java.util.Scanner;

public class SimpleInterest{
	
	//method to find out the simple interest
	public static double findSimpleInterest(double principal, double rate, int time){
		double simpleInterest=(principal*rate*time)/100; // formula for finding simle interest
		return simpleInterest;  //return the value
	}
	
	public static void main(String[] args){
		//create a Scanner object
		Scanner input=new Scanner(System.in);
		
		//get input values for principal,rate and time
		System.out.print("Enter principal amount: ");
		double principal=input.nextDouble();
		System.out.print("Enter rate: ");
		double rate=input.nextDouble();
		System.out.print("Enter the time period: ");
		int time=input.nextInt();
		
		//call the method to find out simple interest
		double simpleInterest=SimpleInterest.findSimpleInterest(principal,rate,time);
		
		//displaying the result
		System.out.println("The Simple Interest is: "+simpleInterest+" for Principal: "+principal+", Rate of Interest: "+rate+" and Time: "+time);
		
		input.close(); //closing input stream
		
	}
}