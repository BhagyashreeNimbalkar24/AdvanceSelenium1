package AdvanceSelenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basicddt {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoapp.skillrary.com/");
		
		driver.manage().window().maximize();
		
		FileInputStream fis = new FileInputStream("src\\test\\resources\\Data1.properties");
		
		Properties p = new Properties();
		
		p.load(fis);
		
		String url = p.getProperty("https://demoapp.skillrary.com/");
		
		String email = p.getProperty("Email");
		
		String pass = p.getProperty("Password");
		
		driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		
		
		
		



	}

}
