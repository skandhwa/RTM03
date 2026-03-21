package TestClass;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PageClasses.BookedAppointmentPage;
import Utilities.BaseClass;
import Utilities.ListenerImplementation;
@Listeners(ListenerImplementation.class)

public class BookedAppointmentTest extends BaseClass {
	
	@Test(retryAnalyzer=Utilities.RetryAnalyzer.class)
	public void validateAppointments() throws InterruptedException
	{
		
		NewAppointmentTest.createAppointment("06/04/2026" ,"This booking is for physician");
		driver.findElement(BookedAppointmentPage.hamburgerMenu()).click();
		driver.findElement(BookedAppointmentPage.historyIcon()).click();
	List<WebElement> li=	driver.findElements(BookedAppointmentPage.panelCounts());
	int x=li.size();
	Assert.assertEquals(1,x);
	
	System.out.println("Appointment booked and showing in the application");
	
	
	
		
		
	}
	
	
	

}
