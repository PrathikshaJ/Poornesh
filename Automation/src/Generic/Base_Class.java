package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Class implements Framework_Constants
{

	
	public static WebDriver driver;
	public WebDriverWait wait;
	
	@BeforeMethod
	public void openapp()
	{

		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		 wait = new WebDriverWait(driver, 10);
	}
	
	@AfterMethod
	public void closeapp()
	{
		driver.close();
		
	}

}
