package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Men extends Shoppersstack1{
	
	@Test
	public void men() throws IOException {
		
        Actions a = new Actions(driver);
		
		WebElement men = driver.findElement(By.id("men"));
		
		a.moveToElement(men);
		
		a.perform();
		
		driver.findElement(By.xpath("//a[text()='T-shirts']")).click();
		
		List<WebElement> all = driver.findElements(By.xpath("//button[text()='add to cart']"));
		
		for(WebElement web : all) {
			
		web.click();
		
		WebElement country = driver.findElement(By.id("Country"));
		
		Select s = new Select(country);
		
		s.selectByValue("Canada");
		
        WebElement state = driver.findElement(By.id("State"));
		
		Select s1 = new Select(state);
		
		s.selectByValue("Andhra Pradesh");
		
        WebElement city = driver.findElement(By.id("City"));
		
		Select s2 = new Select(city);
		
		s.selectByValue("Belagavi");
		
		driver.findElement(By.id("submit")).click();
	}

}
	
}
















































































































































































































































































