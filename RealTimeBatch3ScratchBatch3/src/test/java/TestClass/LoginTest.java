package TestClass;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageClasses.LoginPage;
import Utilities.BaseClass;
import Utilities.ListenerImplementation;

@Listeners(ListenerImplementation.class)
public class LoginTest extends BaseClass {
	
	@Test(priority=0,groups="sanity1")
	public static void executeLogin() throws InterruptedException
	{
		driver.findElement(LoginPage.hamburgerMenu()).click();
		driver.findElement(LoginPage.loginBtn()).click();
		driver.findElement(LoginPage.userName()).sendKeys("John Doe");
		driver.findElement(LoginPage.password()).sendKeys("ThisIsNotAPassword");
		driver.findElement(LoginPage.submitBtn()).click();
		
		Thread.sleep(5000);
		
		
	}
	

}
