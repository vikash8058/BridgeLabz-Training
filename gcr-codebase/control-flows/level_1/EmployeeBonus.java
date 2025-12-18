//program to find employee bonus
import java.util.Scanner;

public class EmployeeBonus
{
    public static void main(String[] args)
    {
	//create Scanner object
	Scanner input=new Scanner(System.in);

	//get input values
	System.out.print("Enter salary: ");
	double salary=input.nextDouble();

	System.out.print("Enter years of service: ");
	int years=input.nextInt();

	//check for bonus eligibility
	if(years>5)
	{
	    double bonus=salary*0.05;
	    System.out.println("The bonus amount is "+bonus);
	}
	else
	{
	    System.out.println("No bonus applicable");
	}

	input.close();  //closing input stream
    }
}
