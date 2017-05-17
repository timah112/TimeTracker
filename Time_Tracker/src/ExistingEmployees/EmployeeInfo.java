//********************************************************************
//
//
//
//
//
//*********************************************************************
package ExistingEmployees;

import java.util.Scanner;

public class EmployeeInfo {


	//create a constructor without parameters for the class
	public EmployeeInfo(){

	}

	
	//********************************************************************
	//This will print the Employee's basic information to the user.
	//
	//
	//********************************************************************	
	public void printInfo()
	{
		//call the class that has all the methods of NON- exising employees.
		System.out.println("Please enter your name or User ID below:");

		String yourName = "";
		Scanner name = new Scanner(System.in);
		yourName = name.nextLine();

		System.out.printf("Welcome back, %s ", yourName + "\n"); 
		System.out.println("");
	}
	
	//********************************************************************
	//This is the main option menu that gets displayed to the user
	//The user will select one of the options and the menu will call all the reuired methods
	//
	//********************************************************************
	public void optionMenu()
	{
		System.out.println(" ---- Main Menu: ----");
		System.out.println("Please enter from the list of options below:");
		System.out.println("Option 1: View all of your information");
		System.out.println("Option 2: Clock In");
		System.out.println("Option 3: Clock Out");
		System.out.println("Option 4: View Recorded Time");
		System.out.println("Option 5: Request Time off Through email");
		System.out.println("Option 6: Quit");
	}
	
	
	//******************************************************************************
	//This method will print all of the user information
	//The information will include, name, DOB, Password, crewID, Start Date, Manager Name
	//This will call the inputs from the newEmployee Info class
	//
	//******************************************************************************
	
	
	
	
}

