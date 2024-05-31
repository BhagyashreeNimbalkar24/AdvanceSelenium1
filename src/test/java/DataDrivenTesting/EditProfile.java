package DataDrivenTesting;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EditProfile extends Shoppersstack1{
	
	@Test
	public void editprofile() {
		driver.findElement(By.xpath("(//div[text()='B'])[1]")).click();
		
		driver.findElement(By.xpath("//li[text()='My Profile']")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Edit Profile')]")).click();
		
		
		
		
		
	    
		
		
		
		
		
	}

}