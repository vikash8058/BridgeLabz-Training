//program to check whether a given date is Spring Season or not
public class SpringSeason
{
	//method to check Spring Season
	boolean checkSpringSeason(int month,int day)
	{
		if((month==3 && day>=20) ||
		   (month==4) ||
		   (month==5) ||
		   (month==6 && day<=20))
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args)
	{
		//convert command line arguments to int
		int month=Integer.parseInt(args[0]);
		int day=Integer.parseInt(args[1]);

		//creating object of the class
		SpringSeason spring=new SpringSeason();

		//calling the method to check Spring Season
		boolean result=spring.checkSpringSeason(month,day);

		//display result
		if(result)
		{
			System.out.println("Its a Spring Season");
		}
		else
		{
			System.out.println("Not a Spring Season");
		}
	}
}
