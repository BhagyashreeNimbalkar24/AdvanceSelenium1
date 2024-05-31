package DataDrivenTesting;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderBasic {
	
	@Test(dataProvider = "login")
	public void receiver(String username,String password) throws InterruptedException {
		
		    WebDriver driver = new ChromeDriver();
		    
		    driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://demowebshop.tricentis.com/");
			
			driver.findElement(By.xpath("//a[text()='Log in']")).click();
			
	        driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
			
			driver.findElement(By.id("Password")).sendKeys("admin01");
			
			driver.findElement(By.cssSelector("input[value='Log in']")).click();
			
			Thread.sleep(2000);
			
			driver.close();
			
			
	}
	
	@DataProvider(name = "login")
	public Object[][] sender() throws EncryptedDocumentException, IOException {
		
		return DataProviderUtility.dwsLogin(); 
		
		
		
		
	}

}
