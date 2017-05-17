package CompanyInfo;

import java.util.ArrayList;
import java.util.List;

public enum basicInfo { //enumerations are constants that are also objects in Java
	
	
	CEO("Bill McNabb"),
	Founder("John Bogle"),
	History("The Vanguard Group was founded on 1975 by John Bogle. He had a idea to help investors buy"
			+ "mutual funds..."),
	Assets("4 Trillion"),
	Employees("15000");
	
	private final String description1;

	basicInfo(String Desc1){
		description1 = Desc1;
	
	}
	
	//**************
	//Get Methods
	//************
	public String getDescription() {
		return description1;
	}
	
	
	
	
	
}
