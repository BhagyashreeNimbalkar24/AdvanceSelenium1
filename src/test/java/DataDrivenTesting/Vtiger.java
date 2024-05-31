package DataDrivenTesting;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Vtiger {
	
    @Test
    public void vtigerLogin() throws IOException, InterruptedException {
    	
    	Properties p = new Properties();
    	
    	FileInputStream fis = new FileInputStream("./Configuration/VrigerLogin.properties");
    	
    	p.load(fis);
    	
    	String url = p.getProperty("url");
    	
    	String username = p.getProperty("username");
    	
    	String password = p.getProperty("password");	
    	
    	WebDriver driver = new ChromeDriver();
    	
        driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(url);
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("user_name")).sendKeys(username);
		
		driver.findElement(By.name("user_password")).sendKeys(password);
		
		driver.findElement(By.id("submitButton")).click();
    			
    	
    	
    	
    	
    }
	
	
	
	
}
