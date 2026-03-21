package PageClasses;

import org.openqa.selenium.By;

public class LoginPage {
	
	public static By hamburgerMenu()
	{
		return By.xpath("//*[@id='menu-toggle']");
	}
	
	public static By loginBtn()
	{
		return By.xpath("//*[text()='Login']");
	}
	
	public static By userName()
	{
		return  By.xpath("//*[@id='txt-username']")  ;
	}
	
	public static By password()
	{
		return By.xpath("//*[@id='txt-password']");
	}
	
	public static By submitBtn()
	{
		return By.xpath("//*[@type='submit']");
	}
	
	
	
	
	
	
	
	
	

}
