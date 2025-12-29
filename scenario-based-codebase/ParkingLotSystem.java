/*program for parking lot gate system 
Parking Lot Gate System 🚗
Develop a smart parking system.
● Options: Park, Exit, Show Occupancy
● Use switch-case for the menu.
● while loop to continue until the parking lot is full or the user exits
*/

import java.util.Scanner;

public class ParkingLotSystem{
	
	//method that check the Parking lot is full or not
	public static boolean isFull(boolean[] occupancy){
		for(boolean slot:occupancy){
			if(!slot){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		
		//create a Scanner object
		Scanner input=new Scanner(System.in);
		
		//created a boolean array of size 10 that shows the occupancy
		boolean[] occupancy=new boolean[10];
		int lot=0;
		
		while(true){
			
			//get the value for option which user wants
			System.out.print("Enter the option : \n1- for Park:  \n2- for Show Occupancy:  \n3- for Exit: ");
			int option=input.nextInt();
			
			switch(option){
				case 1:
					if(isFull(occupancy)){
                        System.out.println("Parking lot is FULL!");
                    }
                    else{
                        for(int i = 0; i < occupancy.length; i++){
                            if(!occupancy[i]){
                                occupancy[i] = true;
                                System.out.println("Successfully parked in slot: " + (i + 1));
                                break;
                            }
                        }
                    }
					break;
					
				case 2:
					if(lot==0){
						System.out.println("There is no any Lots are occupied");
					}
					else{
						for(int i=0;i<lot;i++){
							System.out.print((i+1)+" ");
						}
						System.out.println();
					}
					break;
					
				case 3:
					System.exit(0);
					break;
					
				default:
					System.out.println("Invalid option....Please choose right option");
			}
		}
		
		input.close(); //closing input stream
	}
}