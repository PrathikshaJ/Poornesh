package testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class FetchDataFromProperty { 
	
	@Test
	public void test() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("./property/data.properties");
		prop.load(fis);
		String url = prop.getProperty("URL");
		System.out.println(url);
		String us=prop.getProperty("USERNAME");
		System.out.println(us);
		
	
		
		
	}

}
