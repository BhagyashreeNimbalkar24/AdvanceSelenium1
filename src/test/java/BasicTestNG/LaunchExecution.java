package BasicTestNG;
 
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchExecution
{
    @Test(priority = 1,enabled = true)
	public void myntra() {	
    	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.myntra.com/");
		
		driver.close();
    }
    
    @Test(priority = 1,invocationCount = 2,threadPoolSize = 2)
	public void flipkart() {
    	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		
		driver.close();
    }
    
    @Test(priority = 0)
	public void mumbai() {
    	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.mumbaiindians.com/");
		
		driver.close();
    }
		
		
}
