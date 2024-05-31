package CommonUtil;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtil {

	public String getDataFromPropertyFile(String url) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\bhagy\\Desktop\\Data1.properties");
		
		Properties p = new Properties();
		
		p.load(fis);
		
		String value = p.getProperty(keyname);
		
		return value;
		
		
		
		

	}

}
