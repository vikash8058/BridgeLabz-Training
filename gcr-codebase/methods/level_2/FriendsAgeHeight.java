//program to find youngest and tallest friend
import java.util.Scanner;

public class FriendsAgeHeight
{
	//method to find youngest age
	public static int findYoungest(int age[])
	{
		int youngest=age[0];

		for(int i=1;i<age.length;i++)
		{
			if(age[i]<youngest)
			{
				youngest=age[i];
			}
		}

		return youngest;
	}

	//method to find tallest height
	public static int findTallest(int height[])
	{
		int tallest=height[0];

		for(int i=1;i<height.length;i++)
		{
			if(height[i]>tallest)
			{
				tallest=height[i];
			}
		}

		return tallest;
	}

	public static void main(String[] args)
	{
		//create Scanner object
		Scanner input=new Scanner(System.in);

		int age[]=new int[3];
		int height[]=new int[3];

		//take input values
		for(int i=0;i<3;i++)
		{
			System.out.print("Enter age of friend "+(i+1)+": ");
			age[i]=input.nextInt();

			System.out.print("Enter height of friend "+(i+1)+": ");
			height[i]=input.nextInt();
		}

		//call methods and display result
		System.out.println("Youngest age: "+findYoungest(age));
		System.out.println("Tallest height: "+findTallest(height));

		input.close(); //closing input stream
	}
}
