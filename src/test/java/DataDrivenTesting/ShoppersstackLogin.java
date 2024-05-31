package DataDrivenTesting;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ShoppersstackLogin {
	
	@Test(dataProvider = "login")
	public void receiver(String username,String password) throws InterruptedException {
		
		    WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			
			driver.get("https://www.shoppersstack.com/");
			
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("button[class='navbar_Loginbutton__O9-64']")).click();
			
			Thread.sleep(2000);
			
	        driver.findElement(By.id("Email")).sendKeys("bhagyashreenimbalkar61@gmail.com");
			
			driver.findElement(By.id("Password")).sendKeys("12345");
			
			driver.findElement(By.xpath("//span[text()='Login']")).click();
			
			Thread.sleep(2000);
			
			driver.close();
			
			
	}
	
	@DataProvider(name = "login")
	public Object[][] sender() throws EncryptedDocumentException, IOException {
		
		return DataProviderUtility.shopperstackLogin(); 
		
		
		
		
	}

}
