package testng_01;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class class02 {
	@Test
	public void webloginorangehrm() {
		System.out.println("This is tc for login in orange hrm");
	}
	@Test
	public void weblogoutorangehrm() {
		System.out.println("This is tc for logout in orange hrm");
	}
	@Test
	public void mobileloginorangehrm() {
		System.out.println("This is tc for mobile login in orange hrm");
	}
	@Test
	public void mobilelogoutorangehrm() {
		System.out.println("This is tc for mobile logout in orange hrm");
	}
	@BeforeSuite
	public void tc() {
		System.out.println("This should run in suit level");
	}
	@Test(groups = {"Smoke"})
	public void username_tc() {
		System.out.println("i have username in me");
	}
	@Test(groups = {"Smoke"})
	public void password_tc() {
		System.out.println("i have paswoord in me");
	}
	

}
