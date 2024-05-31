
package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadExcelData {
	
	
	@Test
	public void read() throws IOException {
		
		File path = new File("C:\\Users\\bhagy\\Desktop\\Data2.properties.xlsx");
		
		FileInputStream fis = new FileInputStream(path);
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("Sheet1");
		
		/* url = sh.getRow(0).getCell(1).toString();
		
		System.out.println("Url is :"+ url);
		
        String email = sh.getRow(1).getCell(1).toString();
		
		System.out.println("Email is :"+ email);
		
        String pass = sh.getRow(2).getCell(1).toString();
		
		System.out.println("Password is :"+ pass);*/
		
	int row = sh.getPhysicalNumberOfRows();
	
	int cell = sh.getRow(0).getPhysicalNumberOfCells();
	
	for(int i=0;i<row;i++) {
		
	
	
	for(int j=0;j<cell;j++) {
      
		
    String sheet=sh.getRow(i).getCell(j).toString();
    System.out.println(sheet);
    
    


	}
	}
		
		
		
		
		
		
	}

}
