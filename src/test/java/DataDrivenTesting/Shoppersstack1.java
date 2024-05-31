package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Shoppersstack1 {
	
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
	public void beforeMethod() throws InterruptedException, IOException {
		
        Properties p = new Properties();
		
        FileInputStream fis = new FileInputStream("./Configuration/ShoppersStackLogin.properties");
		
		p.load(fis);
		
		driver.findElement(By.id("loginBtn")).click();
		
		String email =  p.getProperty("email");
		
		String password = p.getProperty("password");
		
		
		
		/*String firstname = p.getProperty("firstname");
		
		String lastname = p.getProperty("lastname");
		
		String dateofbirth = p.getProperty("dateofbirth");
		
		//System.out.println("To log in to the web application");*/
		
		//Thread.sleep(2000);
		
        driver.findElement(By.id("Email")).sendKeys(email);
		
		driver.findElement(By.id("Password")).sendKeys(password);
		
		driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[1]")).click();    
		
		/*driver.findElement(By.id("First Name")).sendKeys(firstname);
		
		driver.findElement(By.id("Last Name")).sendKeys(lastname);
		
		driver.findElement(By.id(":rh:")).sendKeys(dateofbirth);*/
		}
	
	
		
	@AfterMethod
	public void afterMethod() {
		System.out.println("To log out from the web application");
		}
	
	@AfterClass
	public void afterClass() {
		System.out.println("To close the browser");
		
	//driver.close();
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
