package DataDrivenTesting;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ShopperLogin {
	@Parameters({"url","email","password"})
	@Test
	public void shopperLogin(String url,String email,String password) {
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(url);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginBtn")));
		
		WebElement Login = driver.findElement(By.id("loginBtn"));
		
		if(Login.isEnabled()) {
			
			Login.click();
			
			driver.findElement(By.id("Email")).sendKeys(email);
			
			driver.findElement(By.id("Password")).sendKeys(password);
			
			driver.findElement(By.xpath("//span[text()='Login']")).click();
		}
		
		else {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", Login);
		}
		
        
		
		
		
	}

}
