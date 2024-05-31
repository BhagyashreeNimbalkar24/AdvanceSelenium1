package shoes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Campus {
	
	@Test
	public void Campustest() {
    	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.campusshoes.com/?utm_source=icubeswire&utm_medium=affiliate&utm_campaign=performance&utm_term=eWFP7L");
		
		driver.close();
    }

}
