package Assertion;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class DwsBasePage {
	
	public WebDriver driver;

//	@BeforeSuite

//	public void beforeSuite() {

//		System.out.println("connecting to the data base");

//	}

//	

//	@BeforeTest

//	public void beforeTest() {

//		System.out.println("WELCOME TO THE PAGE");

//	}

	

	

	@BeforeClass
	public void beforeClass() {

		driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		//enter the DWS url

		

	}

	@BeforeMethod
	public void beforeMethod() {



		System.out.println("WELCOME TO THE PAGE");

	}

	

	@AfterMethod
	public void afterMethod() {



		System.out.println("THANK YOU FOR COMING");

	}

	

	@AfterClass
	public void afterClass() {

		driver.close();

	}

//	

//	@AfterTest

//	public void afterTest() {

//		System.out.println("THANK YOU FOR COMING");

//	}

//	

//	@AfterSuite

//	public void aftersuite() {

//		System.out.println("disconnect to database");

//	}



}
