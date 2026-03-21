package PageClasses;

import org.openqa.selenium.By;

public class LogOutPage {
	
	public static By hamburgerMenu()
	{
		return By.xpath("//*[@id='menu-toggle']");
	}
	
	public static By logoutBtn()
	{
		return By.xpath("(//a[text()='Logout'])[1]");
	}
	
	public static By homeIcon()
	{
		return By.xpath("//a[text()='Home']");
		
	}
	
	public static By loginIcon()
	{
		return By.xpath("//a[text()='Login']");
		
	}
	
	

}
