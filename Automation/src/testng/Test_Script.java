package testng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;



public class Test_Script extends Base_Class
{

	@Test
	public void test() throws IOException
	{
		String username = Generic_Excel.getData("Sheet1",0,0);
		String lastname = Generic_Excel.getData("Sheet1",1,0);
		String emailid = Generic_Excel.getData("Sheet1",2,0);
		String mobileno = Generic_Excel.getData("Sheet1",3,0);


		Pom_Class pm=new Pom_Class(driver);
		pm.first(username);

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("firstName"))));

		pm.last(lastname);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("lastName"))));

		pm.mail(emailid);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("userEmail"))));

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//label[.='Male']"))));
		pm.mradio();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//label[.='Female']"))));

		pm.fradio();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//label[.='Other']"))));

		pm.oradio();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("userNumber"))));

		pm.mobile(mobileno);

		Utility_Methods.scrollanddisabled(driver).executeScript("window.scrollBy(0,350)");
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("dateOfBirthInput"))));
		pm.dateofbirth();
		Utility_Methods.drop_down(pm.getdd1()).selectByVisibleText("May");
		Utility_Methods.drop_down(pm.getdd2()).selectByVisibleText("1995");

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[.='15']"))));
		pm.dateselect();

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("dateOfBirthInput"))));
		pm.dateofbirth();

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("subjectsContainer"))));
		pm.subjectclick();

		





	}
}
