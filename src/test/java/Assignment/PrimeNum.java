package Assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class PrimeNum {
	
	@Test
	public void primeNum() throws EncryptedDocumentException, IOException {
		
		File path = new File("C:\\Users\\bhagy\\Desktop\\Data2.properties.xlsx");
		
		FileInputStream fis = new FileInputStream(path);
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("Sheet2");
		
		int row = sh.getPhysicalNumberOfRows();
		
		int cell = sh.getRow(0).getPhysicalNumberOfCells();
		
		double num=0;
		int i;
		 for ( i = 0; i < row; i++) {
			 for (int j = 0; j < cell; j++) {
				 String data = sh.getRow(i).getCell(j).toString();
				  num = Double.parseDouble(data) ;
				  //int n1=(int)num;
				  //System.out.println(n1);
				  if(isPrime(num) && num!=1)
				  {
					  System.out.println("It is a prime number"+"=" +num);
				  }
				  else {
					  System.out.println("It is not a prime number"+"=" +num);
				  }
				 
			}
			 
		 }
		
		
	}

	public static boolean isPrime(double num)
	{
		
		for (int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				return false ;
			}
		}
		return true;


		
		
		
	}

}
