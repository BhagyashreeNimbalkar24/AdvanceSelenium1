package AdvanceSelenium;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import CommonUtil.ExcelUtil;
import CommonUtil.PropertyFileUtil;

public class ExcelUtilTest1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		ExcelUtil eutil = new ExcelUtil();
		
		String eu = eutil.getDataFromExcel("Sheet1", 0, 0);
		
		PropertyFileUtil putil = new PropertyFileUtil();
		
		String pu = putil.getDataFromPropertyFile("url");
		
		System.out.println(eu);
		
		System.out.println(pu);
		
		
		
		

	}

}
