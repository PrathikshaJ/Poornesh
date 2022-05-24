package testng;

import java.io.File;
import java.io.IOException;
import java.util.Date;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Generic_Screenshot {

	public static void getPhoto(WebDriver driver) throws IOException 
	{
	
		String photo = "./Photo";
		Date d= new Date();
		
		
		TakesScreenshot tss =(TakesScreenshot) driver;
        File src = tss.getScreenshotAs(OutputType.FILE);
        File dst=new File(photo+d+".jpeg");
        FileHandler.copy(src, dst);
     
       
	}

}
