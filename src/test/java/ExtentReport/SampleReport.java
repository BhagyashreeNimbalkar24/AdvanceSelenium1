package ExtentReport;

import java.io.File;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleReport {
	
	@Test
	public void lauchReport() {
		
		ExtentReports report = new ExtentReports();
		
		File path = new File("./ExtentReport/samplereport.html");
		
		ExtentSparkReporter spark = new ExtentSparkReporter(path);
		
		spark.config().setDocumentTitle("Selenium");
		
		spark.config().setReportName("Bhagyashree");
		
		spark.config().setTheme(Theme.DARK);
		
		//Attach the spark report to extent report
		report.attachReporter(spark);
		
		report.setSystemInfo("Os", "Window-11");
		
		report.setSystemInfo("Browser", "Edge");
		
		//Create the test case
		ExtentTest test1 = report.createTest("test1");
		
		test1.log(Status.FAIL, "login function error");
		
		report.flush();
		
	}

}
