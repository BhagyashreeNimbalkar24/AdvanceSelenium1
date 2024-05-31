package shoes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Adidas {
	
	@Test
	public void Adidastest() {
    	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.adidas.co.in/outlet?cm_mmc=AdieSEM_Google-_-adidas-Brand-B-Exact-RLSA-SA-_-Search-_--_-dv%3AeCom-_-cn%3Aadidas-Brand-B-Exact-RLSA-SA-_-pc%3AGoogle&cm_mmc1=IN&cm_mmc2=PPC-Multiple--Multiple-Multiple-IN-EMEA-eCom-Paid_Search&gad_source=1&gclid=CjwKCAjwi_exBhA8EiwA_kU1MhbDmvcjXFlu19mV3s3xLuTUaQzGI-ZXG0I8XWinVDom8gS-UFyOxxoCnT8QAvD_BwE");
		
		driver.close();
    }

}
