//********************************************
//This is the parent class of this Package
//
//
//**********************************************
package NewEmployees;


import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import CompanyInfo.basicInfo;
import Interface.NewEmpInfoInterface;
import View.Controller;

public class newEmpInfo extends NewEmployeeTimes implements NewEmpInfoInterface{

	//Class Variables:
	int bdate = 0;
	String pw = "";
	int hDate = 0;
	public int idHolder;



	//Scanner type variable class declerations
	Scanner managerNameScanner = new Scanner(System.in);
	Scanner newCrewIDScanner = new Scanner(System.in);
	Scanner nameScanner = new Scanner(System.in);
	Scanner birthday = new Scanner(System.in);



	//private member variables to display the date format
	private int dateMonth = 0;
	private int dateDay = 0;
	private int dateYear = 0; 
	private int dateTotal; 

	private String reEnter;
	public int number;


	//using a static method that prints the main screen
	public static void mainMenu(){


		System.out.println("");
	}
	
	public void ScannerObjectHolder(){
		newCrewIDScanner= null;
		nameScanner = null;
		managerNameScanner = null;
		birthday = null;

	}
	//******************************************************************************
	//This method asks the empoloyee's basic information such NAME, and GENDER.
	//Then, this info will get stored on a database
	//*******************************************************************************
	public void StartInfo(){

		//call the class that has all the methods of NON- existing employees.
		System.out.println("Welcome.");
		System.out.println("To begin, please enter your first and last name below:");

		String yourName = "";
		//Scanner nameScanner = new Scanner(System.in);
		yourName = nameScanner.nextLine();
		System.out.printf("Hello, %s \n", yourName); 
	}
	//CREW ID STEP 1:
	public void onBoardingSteps(){
		System.out.println("\n---- New Oboarding Steps: ----");
		System.out.println("Step 1: Lets generate your new Crew ID. Enter '1' to continue");
		//Scanner newCrewIDScanner = new Scanner(System.in);
		int id = newCrewIDScanner.nextInt();

		if(id == 1){
			randomCrewIDGenerator(); //Displays a randomly created crew ID generator for the memeber
		}
	}
	//******************************************************************************
	//This method will generate a random CREWID, and will ask the user/ emp to inpuT/create PW:
	//Then this information will get stored on a databse
	//CREW ID STEP 2:
	//****************************************************************************
	public int randomCrewIDGenerator(){
		Random dice = new Random();
		//number = 0;
		//for (int counter = 1; counter <=10; counter++){
		this.number = 1+ dice.nextInt(100000);
		int idHolder =  this.number;
		System.out.println("Your new generated Crew ID number is: " + idHolder  + "");
		return idHolder;
	}


	public class innerClassBasicInfo{

		//******************************************************************************
		//This method will ask for the user's basic information
		//The info will be the date of birth, password, and hiring date
		//******************************************************************************
		public void basicInfo(){
			System.out.println("Please enter your date of birth(MM/DD/YYYY)");

			dateMonth = birthday.nextInt();
			dateDay = birthday.nextInt();
			dateYear = birthday.nextInt();

			System.out.println("birthday: " + dateMonth + "/" + dateDay + "/" + dateYear);

			System.out.println("Please enter your Hiring date: ");
			Scanner hiringDate = new Scanner(System.in);
			dateMonth = hiringDate.nextInt();
			dateDay = hiringDate.nextInt();
			dateYear = hiringDate.nextInt();
			//dateTotal = dateMonth + dateDay + dateYear;

			System.out.println("Your hiring date is: " + + dateMonth + "/" + dateDay + "/" + dateYear);

			System.out.println("Thanks!");

		}

		public void userPassword(){
			System.out.println("please enter your new password for your user ID. Password must be bewteen 5 - 15 characters.");
			Scanner password= new Scanner(System.in);
			pw = password.nextLine();	
			if(pw.length() <= 5 || pw.length() > 15){
				System.out.println("Please re-enter a password with correct number of characters.");
				userPassword();
			}
			else if(pw.length()> 5 && pw.length() < 15){
				System.out.println("Your new password is: " + pw);
			}

		}

	}

	public void manager(String reEnter){
		System.out.println("Enter the name of your Manager:");
		String mName = managerNameScanner.nextLine();
		if (mName.equals("Kevin Vaitis") || ( mName.equals("Kevin" ))){
			System.out.printf("Correct. Your manager's name is: %s", mName);
		}
		else 
			manager(" again");
	}
	
	private static newEmpInfo clear(newEmpInfo newEmp){
		newEmp=null;
		return newEmp;
		
	}

	@Override
	public newEmpInfo clear() {
		// TODO Auto-generated method stub
		return null;
	}

	



}

