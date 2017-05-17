package EmployeeDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class newEmployeeDao {


	public void insertData(){
		try{
			//1. Get a connection to the database:
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "student92");

			//2. Get a statement
			//this is a proper syntax to connect to the db using a 
			Statement myStatement = myConn.createStatement();

			//3. Execute SQL Query
			//ResultSet myRs = myStatement.executeQuery("select * from employeeinfo2");
			String sql = "Insert into student" 
					+ "(ID, NAME, AGE)"
					+ "values (123, 'Donald', 27)";
			myStatement.executeUpdate(sql);

			System.out.println("Intert Complete");


		}
		catch(Exception e){

		}
	}
	}
