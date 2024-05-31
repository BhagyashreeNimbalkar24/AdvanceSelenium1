package BasicTestNG;


import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

public class DemoWebShop extends BasePage{


		
	@Test
	    public void addtocart() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		List<WebElement> elements = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		
		for(WebElement web : elements) {
			
			web.click();
			
		}
		
		Thread.sleep(2000);
	}
		
		
		
		
		
		
		
		

	}


