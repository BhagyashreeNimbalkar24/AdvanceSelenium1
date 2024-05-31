package CommonUtil;

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
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BasePage {
	
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
		}
	
	
	@BeforeMethod
	public void beforeMethod() throws EncryptedDocumentException, IOException {
		System.out.println("To log in to the web application");
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
        driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("admin01");
		
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
			
		
		
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
