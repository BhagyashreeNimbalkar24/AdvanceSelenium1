package BasicTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Myntra2 {
	
	@Test
	public void myntra() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
        String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if(url.equals("https://www.myntra.com/Pune")) {
			System.out.println("Url is matching");
		}
		
		else {
			System.out.println("Url is not matching");
		}
		
		String title = driver.getTitle();
		System.out.println(title);
		
	}
}
	
	
	
		
		
	


