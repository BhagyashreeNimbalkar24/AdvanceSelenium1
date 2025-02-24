package CommonUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class WebDriverUtil {

	public void maximize(WebDriver driver) {
		
		driver.manage().window().maximize();
	}
	
	public void implicitWait(WebDriver driver) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	

}
