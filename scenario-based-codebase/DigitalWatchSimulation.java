/*
16. Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements
*/

public class DigitalWatchSimulation{
	public static void main(String[] args){
		
		/*
		int hh=0, mm=0;  //initialize hours and minutes from 0
		
		//printing the time in the form of HH:MM and stop when it will reach at 13:00
		for(hh=0;hh<24;hh++){
			for(mm=0;mm<60;mm++){
				if(hh==13 && mm==0){
					System.out.println("Power Cut Occured!!! at "+hh +":"+mm);
					break;
				}
				else{
					System.out.println(+hh +":"+mm);
				}
			}
			if(hh==13 && mm==0){
				break;
			}
		}
		*/
		 
		//create a level watch 
		watch:
		
		for(int hour=0;hour<24;hour++){
			for(int minute=0;minute<60;minute++){
				System.out.println(hour +":"+minute);
				if(hour==13 && minute==00){
					System.out.println("Power Cut when time is: 13:00");
					break watch;
				}
			}
		}
		
	}
}