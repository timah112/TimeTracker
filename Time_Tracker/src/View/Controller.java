package View;

import java.util.ArrayList;
import java.util.Scanner;

import CompanyInfo.basicInfo;
import NewEmployees.NewEmployeeTimes;
import NewEmployees.newEmpInfo;

public class Controller {
	
	//This method holds all the objects of the new Employee package
	//the objects held will be generic values
	 public static < E > void objectsHolder(){
		
	}
	
	//this method will hold all the Scanner values from the newEmployees package that the user inputs 
	//as a list or an array of objects.
	//this is done so that the objects can be sent to a database
	public void ScannerHolder(newEmpInfo a, NewEmployeeTimes T){
		ArrayList scannerList = new ArrayList();//declare an array list of objects for all scanner input values
		//T.ScannerHolder(a, T);
		a.ScannerObjectHolder();
		
	}
	
	//method to declare the enum class method which will be called in main.
	public void enumClassMethod(){
		System.out.println();
		System.out.println("Vanguard Information:");
		System.out.println("---------------------");
		for (basicInfo b : basicInfo.values()){
		System.out.println(b+ "\t\t " + b.getDescription());	
		}
	}
	
	
}
