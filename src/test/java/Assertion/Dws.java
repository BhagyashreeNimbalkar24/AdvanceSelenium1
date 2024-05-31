package Assertion;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import CommonUtil.BasePage;

public class Dws extends BasePage{
	
	@Test
	public void hardAssert() {
		
		String expectedUrl = "https://demowebshop.tricentis.com/";
		
		String a = "Satya";
		
		String b = null;
		
		WebDriver driver = new ChromeDriver();
		
        driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		SoftAssert ass = new SoftAssert();
		
		String actualUrl = driver.getCurrentUrl();	
		
		//assertEquals(expectedUrl,actualUrl);
		
		boolean result = expectedUrl.equals(actualUrl);
		
		ass.assertTrue(result);
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Laptop"); 
		
		ass.assertNull(b);
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		ass.assertAll();
		
		
		
		
	}

}
