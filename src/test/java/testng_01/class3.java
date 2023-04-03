package testng_01;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class class3 {
	
	
	
	@Test()
	public void bank_cred_tc() {
		System.out.println("i have bank information in me");
	}
	@Test(dataProvider = "getdata")
	public void logintest_orangehrm(String username, String password) {
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider
	public Object getdata() {
		String[][] data=new String[3][2];
		//user1
		data[0][0]="admi";
		data[0][1]="admin123";
		//user2
	    data[1][0]="Admi";
		data[1][1]="Admin1243";
		//user3
	    data[2][0]="Admin";
		data[2][1]="admin1243";
		return data;
		
	}

}
