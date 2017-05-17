package View;

import java.util.Date;
import java.util.Scanner;

import Domain.EmployeeDomain;
import ExistingEmployees.EmployeeInfo;
import NewEmployees.NewEmployeeTimes;
import NewEmployees.newEmpInfo;

//*********************************************
// This class calls all the methods from the other classes.
// -This program allows for users to input their information and have a random user ID generated for them.
// -When they input their own user id, they can record time, and view recorded time, as well.
// *The user can clock in and clock out with this
// -This program also allows users to view their basic info(name, gender, date of birth, crewID, password, hiring date, Manager)
// -The user can also view their schedule for the week, which was created by administrators
// -The user can also request time off from a manager
// -Also an auto email sender will be sent to the managers, if an employee is 10 mins past arrival time
//**********************************************
public class main {
	public static int option = 0;
	
	
	static EmployeeInfo info ;
	static newEmpInfo newEmp ;
	static NewEmployeeTimes times;
	static EmployeeDomain moreInfo;
	static Controller control;
	static main m;
	
	public static void main (String[] args) {
		//local variables:

		//instantiating the newEmpInfo and EmployeeInfo Classes:
		newEmp = new newEmpInfo();
		info   = new EmployeeInfo();
		moreInfo = new EmployeeDomain();
		times = new NewEmployeeTimes();
		control = new  newEmpInfo();
		m= new main();
		
		
		//Instantiate a generic scanner method to be used for later:
		Scanner input = new Scanner(System.in);

		// TODO Auto-generated method stub
		System.out.println("Existing employees, please enter '1', and non existing employees, enter 0");
		int num = 0;

		Scanner emp = new Scanner(System.in);
		num = emp.nextInt();

		if (num == 1)
		{
			//call the class that has all the methods of exising employees.
			info.printInfo();
			info.optionMenu();
			Scanner menu = new Scanner(System.in);
			option= menu.nextInt();
			//do {
			//while(option!= 5){
			if(option ==1){
				//TO DO
			}
			else if(option ==2){
				//Displays the current date
				newEmp.currentDate();
			}
			//}
		}
		if (num == 0)
		{
			newEmp.StartInfo(); //Step 1: displays the startup hello message to the user
			newEmp.currentDate(); //STEP 2: Displays the current date
			newEmp.onBoardingSteps();//STEP 3: displays onboarding steps
			//If the above step is successful, then move on to this step:
			newEmp.ClockIn();
			
			/*else if (clocking == ) {
				newEmp.ClockOut();
			}*/
			

			//************************************************************************
			//If the above step is successful, then move on to this step:2
			//This will print all the basic information from the inner class that we created; within the outer class:
			//This is calling a method from the inner class, that was created
			//****************************************************************************
			System.out.println("Step 3: Input basic Information");
			newEmpInfo anotherNewEmp = new newEmpInfo();
			newEmpInfo.innerClassBasicInfo inner = anotherNewEmp.new innerClassBasicInfo();
			inner.basicInfo();
			inner.userPassword();

			System.out.println("If you know the name of your manager, enter 1");
			System.out.println("If you do not know the name of your manager, enter 2");
			int choice = input.nextInt();

			if(choice == 1)
			{
				newEmp.manager("Re-Enter");
			}
			if(choice == 2){
				//moreInfo.setManagerName("Kevin Vaitis");
				//System.out.printf("initial name is: %s%n", moreInfo.getManagerName());
				moreInfo.setManagerName("Atif Tirmizi");
				System.out.printf("Name of your manager is: %s ", moreInfo.getManagerName());
			}
			newEmp.enumClassMethod();
			newEmp.ClockOut();
		}
		else if (num ==3){
			m.atif("atif");
			System.out.printf("The answer is: ", Quitter());
			System.out.println(QuitterWithParams(2));
		}
		

		else 
		{
			System.out.println("Incorrect input please enter the correct value and try again.");
		}


	}

	//test static message:
	//static method does not need to be instantiated within the same class
	public static int Quitter(){
		int quitter= 5;
		return quitter;
	}
	public static int QuitterWithParams(int quitter1){
		return quitter1 *10 +6;
	}
	public void atif(String atif){
		//System.out.println(10);
		
	}

}
