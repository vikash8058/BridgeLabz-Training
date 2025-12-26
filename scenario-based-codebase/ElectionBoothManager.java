//program to manage voting process in an election booth
import java.util.Scanner;

public class ElectionBoothManager
{
	public static void main(String[] args)
	{
		//create Scanner object
		Scanner input=new Scanner(System.in);

		while(true)
		{
			//get age of voter
			System.out.print("Enter age (or -1 to exit): ");
			int age=input.nextInt();

			//exit condition
			if(age==-1)
			{
				System.out.println("Election process closed.");
				break;
			}

			//check eligibility
			if(age>=18)
			{
				System.out.println("Eligible to vote.");
				System.out.print("Vote for candidate (1 / 2 / 3): ");
				int vote=input.nextInt();

				if(vote==1 || vote==2 || vote==3)
				{
					System.out.println("Vote recorded successfully.");
				}
				else
				{
					System.out.println("Invalid vote.");
				}
			}
			else
			{
				System.out.println("Not eligible to vote.");
			}

			System.out.println();
		}

		input.close(); //closing input stream
	}
}
