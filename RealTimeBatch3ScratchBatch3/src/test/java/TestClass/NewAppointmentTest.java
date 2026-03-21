package TestClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageClasses.NewAppointmentPage;
import Utilities.BaseClass;
import Utilities.ListenerImplementation;

@Listeners(ListenerImplementation.class)
public class NewAppointmentTest extends BaseClass {
	
	@DataProvider(name="bookAppointment")
	public Object [][] method()
	{
		return new Object [][]
				{
			{"06/04/2026" ,"This booking is for physician"},
			{"09/04/2026","This booking is for Nephrologist"}
			
			
				};
	}
	
	@Test(dataProvider="bookAppointment",retryAnalyzer=Utilities.RetryAnalyzer.class)
	public static void createAppointment(String date,String comment) throws InterruptedException
	{
		LoginTest.executeLogin();
		//driver.findElement(NewAppointmentPage.makeAppointment()).click();
		//scrollDown();
		//Thread.sleep(1000);
		WebElement ele=driver.findElement(NewAppointmentPage.facility());
		Select oselect=new Select(ele);
		oselect.selectByIndex(0);
		driver.findElement(NewAppointmentPage.visitDate()).sendKeys(date);
		keyBoardActionTab();
		//Thread.sleep(3000);
		//driver.findElement(NewAppointmentPage.formGroup()).click();
		driver.findElement(NewAppointmentPage.comment()).sendKeys(comment);
		driver.findElement(NewAppointmentPage.submitBtn()).click();
		Thread.sleep(2000);
		scrollDown();
	boolean flag1=	driver.findElement(NewAppointmentPage.validateMsg()).isDisplayed();
	boolean flag2=	driver.findElement(NewAppointmentPage.validatebookedMsg()).isDisplayed();
		
	if(flag1 && flag2== true)
	{
		System.out.println("Appointment Created and confirmed");
	}
		
		
	
	}
	
	
	
	
	
	
	
	
	

}
