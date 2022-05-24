package TestScript;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import Generic.Base_Class;
import Generic.Generic_Excel;
import Generic.Utility_Methods;
import PomScript.Pom_Class;


public class Test_Script extends Base_Class
{
	
	@Test
	public void test() throws  IOException, InterruptedException, AWTException
	{
		String usname = Generic_Excel.getData("Sheet1", 0, 0);
		String laname = Generic_Excel.getData("Sheet1", 1, 0);
		String e = Generic_Excel.getData("Sheet1",2, 0);
		String m = Generic_Excel.getData("Sheet1",3,0);
		
	
		Pom_Class pm=new Pom_Class(driver);
		pm.firstname(usname);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("firstName"))));
		
		pm.lastname(laname);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("lastName"))));
		
		pm.Email(e);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("userEmail"))));
		
		pm.maleC();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//label[.='Male']"))));
		
		pm.femaleC();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//label[.='Female']"))));
		pm.otherC();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//label[.='Other']"))));
		
		pm.userno(m);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("userNumber"))));
		
		
		
		Utility_Methods.scrollanddisabled(driver).executeScript("window.scrollBy(0,700)");
		
		pm.dob();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("dateOfBirthInput"))));

		
		pm.month();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//option[.='December']"))));
		
		pm.year();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//option[.='1995']"))));
		
		pm.date();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("dateOfBirthInput"))));
		
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("subjectsInput")))).click();
		Thread.sleep(1999);
		Utility_Methods.keyboard_functions(driver).keyPress(KeyEvent.VK_E);
		Thread.sleep(1999);
		Utility_Methods.keyboard_functions(driver).keyPress(KeyEvent.VK_ENTER);
		
		
		pm.sportsRadio();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//label[.='Sports']"))));
		
		pm.readingRadio();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//label[.='Reading']"))));
		
		pm.musicRadio();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//label[.='Music']"))));
		
		pm.BrowsePic("E:\\defect.jpeg");
		pm.currectAdd("Devi Krupa, 7thcross,1 main,Prashanth Nagara");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("currentAddress"))));
		
		Utility_Methods.scrollanddisabled(driver).executeScript("window scrollBy(0,100)");
		
		
		pm.dd1();
		Utility_Methods.keyboard_functions(driver).keyPress(KeyEvent.VK_ENTER);
		
		pm.dd2();
		Utility_Methods.keyboard_functions(driver).keyPress(KeyEvent.VK_ENTER);
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("")
		
	}

}
