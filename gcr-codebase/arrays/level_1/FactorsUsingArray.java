//program to find factors of a number and store them in an array
import java.util.Scanner;

public class FactorsUsingArray
{
	public static void main(String[] args)
	{
		//create Scanner object
		Scanner input=new Scanner(System.in);

		//take input for number
		System.out.print("Enter a number: ");
		int number=input.nextInt();

		//initialize maxFactor and create array
		int maxFactor=10;
		int factors[]=new int[maxFactor];

		//index to store factors
		int index=0;

		//find factors of the number
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				//check if array size is full
				if(index==maxFactor)
				{
					//increase array size
					maxFactor=maxFactor*2;

					//create temporary array
					int temp[]=new int[maxFactor];

					//copy old values to new array
					for(int j=0;j<factors.length;j++)
					{
						temp[j]=factors[j];
					}

					//assign temp array to factors array
					factors=temp;
				}

				//store factor in array
				factors[index]=i;
				index++;
			}
		}

		//display factors
		System.out.println("Factors of "+number+" are:");
		for(int i=0;i<index;i++)
		{
			System.out.print(factors[i]+" ");
		}

		input.close();  //closing input stream
	}
}
