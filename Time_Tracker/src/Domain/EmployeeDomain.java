package Domain;

import java.sql.Date;

import View.Controller;

public class EmployeeDomain extends Controller{

	//private variables:
	private String firstName;
	private String lastName;
	private int age;
	private String email;
	//private Date date;
	
	private String managerName;
	
	
	
	//getting the manager name
	public String getManagerName() {
		return managerName;
	}
	
	//setting the manager name
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//get and set methods for each variable:
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
/*	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}*/
	
}
