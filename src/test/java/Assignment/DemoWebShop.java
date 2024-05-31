package Assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoWebShop extends BasePage{
	
	@Test
	public void giftCards() throws EncryptedDocumentException, IOException {
		
		driver.findElement(By.partialLinkText("Gift Cards")).click();
		
		driver.findElement(By.cssSelector("div[data-productid='1']")).click();
		
		
		//Reading data from excel file
		String recipientName = DemoWebShopUtility.getDataFromExcel("Sheet1", 0, 1);
		
		String recipientEmail = DemoWebShopUtility.getDataFromExcel("Sheet1", 1, 1);
		
		String senderName = DemoWebShopUtility.getDataFromExcel("Sheet1", 2, 1);
		
		String senderEmail = DemoWebShopUtility.getDataFromExcel("Sheet1", 3, 1);																																																																											
		
		String message = DemoWebShopUtility.getDataFromExcel("Sheet1", 4, 1);
		
		
	    //gift card details
		driver.findElement(By.id("giftcard_1_RecipientName")).sendKeys(recipientName);
		
		driver.findElement(By.id("giftcard_1_RecipientEmail")).sendKeys( recipientEmail);
		
		driver.findElement(By.id("giftcard_1_SenderName")).sendKeys(senderName);
		
		driver.findElement(By.id("giftcard_1_SenderEmail")).sendKeys(senderEmail);
		
		driver.findElement(By.id("giftcard_1_Message")).sendKeys(message);
		
		driver.findElement(By.id("add-to-cart-button-1")).click();
		
		
		
		
	}

}
