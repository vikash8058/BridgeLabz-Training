//program to calculate bonus of 10 employees and total payout
import java.util.Scanner;

public class EmployeeBonusCalculation
{
	public static void main(String[] args)
	{
		//create Scanner object
		Scanner input=new Scanner(System.in);

		//create arrays
		double salary[]=new double[10];
		double years[]=new double[10];
		double bonus[]=new double[10];
		double newSalary[]=new double[10];

		//total variables
		double totalBonus=0;
		double totalOldSalary=0;
		double totalNewSalary=0;

		//take input for 10 employees
		for(int i=0;i<10;i++)
		{
			System.out.print("Enter salary of employee "+(i+1)+": ");
			salary[i]=input.nextDouble();

			System.out.print("Enter years of service: ");
			years[i]=input.nextDouble();

			//check invalid input
			if(salary[i]<=0 || years[i]<0)
			{
				i--;
			}
		}

		//calculate bonus and totals
		for(int i=0;i<10;i++)
		{
			if(years[i]>5)
			{
				bonus[i]=salary[i]*0.05;
			}
			else
			{
				bonus[i]=salary[i]*0.02;
			}

			newSalary[i]=salary[i]+bonus[i];

			totalBonus+=bonus[i];
			totalOldSalary+=salary[i];
			totalNewSalary+=newSalary[i];
		}

		//display results
		System.out.println("Total Bonus Amount: "+totalBonus);
		System.out.println("Total Old Salary: "+totalOldSalary);
		System.out.println("Total New Salary: "+totalNewSalary);

		input.close();  //closing input stream
	}
}
