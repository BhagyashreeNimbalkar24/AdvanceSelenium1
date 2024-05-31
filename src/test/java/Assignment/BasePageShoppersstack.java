package Assignment;

import java.io.IOException;

import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import DataDrivenTesting.DataProviderUtility;

public class BasePageShoppersstack {
	
WebDriver driver;
	
	@BeforeSuite
	public void beforeSutite() {
		System.out.println("Connect to the Database");
		}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Pre conditions for test runner");
		}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("To start the browser");
		
        driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.shoppersstack.com/");
		}
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		System.out.println("To log in to the web apploication");
		
		driver.findElement(By.cssSelector("button[class='navbar_Loginbutton__O9-64']")).click();
		
		Thread.sleep(2000);
		
        driver.findElement(By.id("Email")).sendKeys("bhagyashreenimbalkar61@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("12345");
		
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		
		
		}
	
	@DataProvider(name = "login")
	public Object[][] sender() throws EncryptedDocumentException, IOException {
		
		return DataProviderUtility.shopperstackLogin(); 
	}
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("To log out from the web application");
		
		
		}
	
	@AfterClass
	public void afterClass() {
		System.out.println("To close the browser");
		
		driver.close();
		}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Post conditions for test runner");
		}
	
	@AfterSuite
	public void afterSutite() {
		System.out.println("Dis-connect with the database");
		}
	
	

}



