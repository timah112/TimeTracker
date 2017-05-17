package NewEmployees;

import java.util.Date;
import java.util.Scanner;

import View.Controller;

//the abstract class cannot be instantiated
//it will need to be extended from a parent class and that parent class can be extantiated to call this class' methods
public class NewEmployeeTimes extends Controller{

	//instantiating class
	
	
	//List of class Variables:
	int crewID2;
	String UserName;
	int crewID = 0;

	//Scanner variable Declerations:
	Scanner timeIn = new Scanner(System.in);
	Scanner timeOut = new Scanner(System.in);
	
	//this method will print employee's clock in time
	Date date = new Date();

	public void currentDate()
	{
		System.out.println("Today's date and time is: " + date.toString());
	}

	//*******************************************************************************************
	//This Method allows employees to Clock in by inputting their user Id's 
	//Once they input their user id's they will be 'clocking in' and that information will go inside a db
	//New Crew ID Step 3:
	//*******************************************************************************************
	public void ClockIn(){
		newEmpInfo f = new newEmpInfo();
		
		System.out.println("Please enter your Crew ID to clock In");
		//Scanner timeIn = new Scanner(System.in);
		crewID = timeIn.nextInt();
		
		if (crewID == f.idHolder)
		{
			System.out.println("Good. Your Crew ID is: " + crewID);
		}
		else
		{
			System.out.println("Clocking in Unsuccessful. Please try again.");
			//ClockIn();
		}
	}

	//*******************************************************************************************
	//This is the time that the user clocks out.
	//This will get saved into the database
	//once the user enters their username, their time will be recorded and sent to db stating table
	//********************************************************************************************
	public void ClockOut(){
		//crewID;
		System.out.println("Please input your Crew ID to clock out");

		crewID2 = timeOut.nextInt();
		//if (m.timeIn.equals(crewID2)) {
		if(crewID2 == crewID){
			System.out.println("Clocking out Successful. Your records have been successfully recorded!");
		}
		else{
			System.out.println("Clocking out unsuccessful.");
			ClockOut();
		}
	}

	/*
	//NEW CREW ID STEP 3:
	public void Clocking(newEmpInfo n){
		int clocking;
		System.out.printf("Step 2: enter your crew ID to Clock In: ");
		@SuppressWarnings("resource")
		Scanner clockTimes = new Scanner(System.in);
		System.out.println(clocking = clockTimes.nextInt());
		if (clocking == n.randomCrewIDGenerator()) {

			ClockIn(n);
		}
	}
	 */

}
