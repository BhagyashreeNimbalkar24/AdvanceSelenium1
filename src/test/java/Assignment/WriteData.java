package Assignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
        FileInputStream fis = new FileInputStream("C:\\Users\\bhagy\\Desktop\\Data3.properties.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("Sheet1");
		
		Row rw1 = sh.createRow(0);
		
		Cell cl = rw1.createCell(0);
		
		cl.setCellValue("https://www.facebook.com/");
		
        Row rw2 = sh.createRow(1);
		
		Cell c2 = rw2.createCell(0);
		
		c2.setCellValue("admin");
		
        Row rw3 = sh.createRow(2);
		
		Cell c3 = rw3.createCell(0);
		
		c3.setCellValue("admin");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\bhagy\\Desktop\\Data3.properties.xlsx");
		
		wb.write(fos);

	}

}
