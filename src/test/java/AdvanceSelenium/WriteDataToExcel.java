package AdvanceSelenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataToExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C:\\Users\\bhagy\\Desktop\\Data2.properties.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("Sheet2");
		
		Row rw = sh.createRow(3);
		
		Cell cl = rw.createCell(0);
		
	    cl.setCellValue("Bhagyashree");
	    
	    FileOutputStream fos = new FileOutputStream("C:\\Users\\bhagy\\Desktop\\Data2.properties.xlsx");
	    
	    wb.write(fos);
		
		
		
		
		
		
		

	}

}
