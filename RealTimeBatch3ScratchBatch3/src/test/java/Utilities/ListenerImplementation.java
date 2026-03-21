package Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import ConstantsData.ConstantsData;
import org.apache.commons.io.FileUtils;

public class ListenerImplementation extends BaseClass implements ITestListener {

	
	public void onTestStart(ITestResult result) {
		
		ITestListener.super.onTestStart(result);
		System.out.println("My Test Case Started");
		Reporter.log("Test started");
		
	}

	
	public void onTestSuccess(ITestResult result) {
		
		ITestListener.super.onTestSuccess(result);
		System.out.println("My Test Case is successfull");
		Reporter.log("Test case passed");
		
	}

	
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test case failed");
		ITestListener.super.onTestFailure(result);
		Reporter.log("Test case  failed");
		
		TakesScreenshot srcshot=(TakesScreenshot)driver;
		File srcFile=srcshot.getScreenshotAs(OutputType.FILE);
		File destFile=new File(ConstantsData.ScreenShotpath);
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("ScreenShot captured");
		
		
		
		
	}

	
	


	public void onFinish(ITestContext context) {
		
	}

	
	
	
	
}
