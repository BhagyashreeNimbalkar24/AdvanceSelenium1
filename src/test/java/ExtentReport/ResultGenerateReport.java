package ExtentReport;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import CommonUtil.DwsBasePage;

public class ResultGenerateReport extends DwsBasePage{
	
	@Test
	public void dwsLoginCorrect() {
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		//DwsLoginPage dws = new DwsLoginPage(driver);
		
		driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");	
		
		driver.findElement(By.id("Password")).sendKeys("admin01");
		
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		
		
		
	}
	
	@Test
	public void dwsLoginFailed() {
		
       driver.get("https://demowebshop.tricentis.com/");
		
       driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		//DwsLoginPage dws = new DwsLoginPage(driver);
		
		driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");	
		
		driver.findElement(By.id("Password")).sendKeys("admin02");
		
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		
		assertEquals("Bhagyashree","Shree");
		
	}
	
	@Test(dependsOnMethods = "dwsLoginFailed")
	public void redBus() {
		driver.get("https://www.redbus.in/");
		
		assertEquals("Bhagyashree","Shree");
		
	}