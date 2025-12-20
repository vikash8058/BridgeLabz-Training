//program to find roots of a quadratic equation
import java.util.Scanner;

public class QuadraticEquation
{
	//method to find roots and return them
	public static double[] findRoots(double a,double b,double c)
	{
		//calculate delta
		double delta=Math.pow(b,2)-4*a*c;

		//if delta is negative return empty array
		if(delta<0)
		{
			return new double[0];
		}

		//if delta is zero return one root
		if(delta==0)
		{
			double roots[]=new double[1];
			roots[0]=-b/(2*a);
			return roots;
		}

		//if delta is positive return two roots
		double roots[]=new double[2];
		roots[0]=(-b+Math.sqrt(delta))/(2*a);
		roots[1]=(-b-Math.sqrt(delta))/(2*a);

		return roots;
	}

	public static void main(String[] args)
	{
		//create Scanner object
		Scanner input=new Scanner(System.in);

		//take input values
		System.out.print("Enter value of a: ");
		double a=input.nextDouble();

		System.out.print("Enter value of b: ");
		double b=input.nextDouble();

		System.out.print("Enter value of c: ");
		double c=input.nextDouble();

		//call method to find roots
		double roots[]=findRoots(a,b,c);

		//display result
		if(roots.length==0)
		{
			System.out.println("No real roots exist");
		}
		else if(roots.length==1)
		{
			System.out.println("Root: "+roots[0]);
		}
		else
		{
			System.out.println("Root 1: "+roots[0]);
			System.out.println("Root 2: "+roots[1]);
		}

		input.close(); //closing input stream
	}
}
