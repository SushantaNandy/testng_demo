package testng_01;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class class04 {
	WebDriver driver;
	public String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

		
		@BeforeTest
		public void setup() throws MalformedURLException {
			DesiredCapabilities caps=new DesiredCapabilities();
			caps.setPlatform(Platform.MAC);
			caps.setBrowserName("chrome");
			driver=new RemoteWebDriver(new URL("http://192.168.0.103:4444"),caps);
			
			
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		}
		@Test
		public void tc1() {
		//	driver.navigate().to(url);
			
			driver.get(url);
			driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
			driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
			driver.findElement(By.xpath("//*[@type='submit']")).click();
			
		}

}
