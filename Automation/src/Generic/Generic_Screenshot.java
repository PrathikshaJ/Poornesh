package Generic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Generic_Screenshot
{ 
	public static void getPhoto(WebDriver driver) throws IOException
	{ 
		TakesScreenshot tss=(TakesScreenshot) driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dst = new File("E://.jpeg");
		FileHandler.copy(src, dst);
		
	}

}
