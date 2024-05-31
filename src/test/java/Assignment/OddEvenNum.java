package Assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class OddEvenNum {
	
	@Test
	public void oddEvenNum() throws EncryptedDocumentException, IOException {
		
File path = new File("C:\\Users\\bhagy\\Desktop\\Data2.properties.xlsx");
		
		FileInputStream fis = new FileInputStream(path);
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("Sheet2");
		
		int row = sh.getPhysicalNumberOfRows();
		
		int cell = sh.getRow(0).getPhysicalNumberOfCells();	
		
		for (int i = 0; i < row; i++) {
			 for (int j = 0; j < cell; j++) {
				 String data = sh.getRow(i).getCell(j).toString();
				 //int num =Integer.parseInt(data) ;
				double num = Double.parseDouble(data) ;
				
				 if(num%2==0)
				 {
					 System.out.println("Even No => "+num);
				 }
				 else {
					 System.out.println("Odd No => "+num);
				 }
				
			}
		
			
		}


	}

}
