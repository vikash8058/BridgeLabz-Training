//program to find youngest and tallest friend
import java.util.Scanner;

public class YoungestTallestFriend
{
    public static void main(String[] args)
    {
	//create Scanner object
	Scanner input=new Scanner(System.in);

	//get age inputs
	System.out.print("Enter Amar age: ");
	int amarAge=input.nextInt();
	System.out.print("Enter Akbar age: ");
	int akbarAge=input.nextInt();
	System.out.print("Enter Anthony age: ");
	int anthonyAge=input.nextInt();

	//get height inputs
	System.out.print("Enter Amar height: ");
	int amarHeight=input.nextInt();
	System.out.print("Enter Akbar height: ");
	int akbarHeight=input.nextInt();
	System.out.print("Enter Anthony height: ");
	int anthonyHeight=input.nextInt();

	//find youngest friend and display the result
	if(amarAge<akbarAge && amarAge<anthonyAge)
	{
	    System.out.println("Youngest Friend: Amar");
	}
	else if(akbarAge<amarAge && akbarAge<anthonyAge)
	{
	    System.out.println("Youngest Friend: Akbar");
	}
	else
	{
	    System.out.println("Youngest Friend: Anthony");
	}

	//find tallest friend and display the result
	if(amarHeight>akbarHeight && amarHeight>anthonyHeight)
	{
	    System.out.println("Tallest Friend: Amar");
	}
	else if(akbarHeight>amarHeight && akbarHeight>anthonyHeight)
	{
	    System.out.println("Tallest Friend: Akbar");
	}
	else
	{
	    System.out.println("Tallest Friend: Anthony");
	}

	input.close();  //closing input stream
    }
}
