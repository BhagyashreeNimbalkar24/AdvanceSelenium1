package Assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DemoWebShopUtility {
	
public static String getDataFromExcel(String Sheetname,int Rownum,int Cellnum) throws EncryptedDocumentException, IOException {
		
	File path = new File("C:\\Users\\bhagy\\AppData\\Roaming\\Microsoft\\Windows\\Network Shortcuts\\Book1.xlsx");
	
	FileInputStream fis = new FileInputStream(path);
	
	Workbook wb = WorkbookFactory.create(fis);
		
    Sheet sh = wb.getSheet(Sheetname);
		
    Row rw = sh.getRow(Rownum);
		
	Cell cl = rw.getCell(Cellnum);
		
	String value = cl.getStringCellValue();
		
	return value;
	
	
	
	
	}

}
