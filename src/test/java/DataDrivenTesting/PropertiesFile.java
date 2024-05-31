package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PropertiesFile {
	
	@Test
	public void readDataFromPropertiesFile() throws IOException, InterruptedException {
		
		Properties p = new Properties();
		
		FileInputStream fis = new FileInputStream("./Configuration/Configuration.properties");
		
		p.load(fis);
		
		String url = p.getProperty("url");
		
		String username =  p.getProperty("username");
		
		String password = p.getProperty("password");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(url);
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("a[class='ico-login']")).click();
		
		driver.findElement(By.id("Email")).sendKeys(username);
		
		driver.findElement(By.id("Password")).sendKeys(password);
		
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		
	
	}

}
