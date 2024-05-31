package Listeners;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import CommonUtil.DwsBasePage;

public class CaptureFailedScreenshot extends DwsBasePage implements ITestListener{
	
	public void onTestFailure(ITestResult result) {
	
	LocalDateTime date = LocalDateTime.now();
	
	String time = date.toString().replace(":","-");
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	
	File tempfile = ts.getScreenshotAs(OutputType.FILE);
	
	File desfile = new File("./Screenshot/failedshot"+time+".png");
	
	try {
		
		FileHandler.copy(tempfile, desfile);
	}
	
	catch(IOException e) {
		
		e.printStackTrace();
		}
	
	
	
	
	}
	
	
	

}
