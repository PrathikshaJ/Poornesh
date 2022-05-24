package testng;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportExample

{
	WebDriver driver;
	@Test
	public void test() throws IOException
	{
		ExtentReports extent = new ExtentReports("./extentreport/extent.html");
		ExtentTest report = extent.startTest("Demo Test");
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
				driver=new FirefoxDriver();
				driver.get("https://www.zomato.com");
				String title="Zomato";
				if(driver.getTitle().equals(title))
				{
					report.log(LogStatus.PASS, "Testcase pass");
				}
				else
				{
					report.log(LogStatus.FAIL, report.addScreenCapture(Screenshot()));
				}
				extent.endTest(report);
				extent.flush();
				
				
	}
	public String Screenshot() throws IOException
	{
		String dst = "E://defect.jpeg";
		TakesScreenshot tss=(TakesScreenshot) driver;
		File src=tss.getScreenshotAs(OutputType.FILE);
		File prim=new File(dst);
		FileHandler.copy(src, prim);
		
		
		
		return dst;
	}

}
