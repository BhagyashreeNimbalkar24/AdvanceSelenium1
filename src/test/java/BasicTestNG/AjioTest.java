package BasicTestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AjioTest {
	
  @Test(priority = 1,invocationCount = 2)
  public void Facebook() {
	  //System.out.println("Facebook");
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  
	  
  }
  
  @Test(priority = 1)
  public void Amazon() {
	  //System.out.println("Amazon");
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://www.amazon.com/");
  }
  
  @Test(priority = 0)
  public void Myntra() {
	  //System.out.println("Myntra");
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://www.myntra.com/");
  }
	
	
	

}
