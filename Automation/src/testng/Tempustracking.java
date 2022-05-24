package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Tempustracking {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://122.166.192.191:9004/en/login");
		Thread.sleep(1999);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rahul");
		Thread.sleep(1999);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rahul@123");
		Thread.sleep(1999);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1999);
		
		driver.findElement(By.xpath("//span[.='Customers']")).click();
		Thread.sleep(1999);
		driver.findElement(By.xpath("//a[@href='/en/admin/customer/create']")).click();
		Thread.sleep(1999);
		driver.findElement(By.xpath("//input[@id='customer_edit_form_name']")).sendKeys("LG");
		Thread.sleep(1999);
		WebElement ele = driver.findElement(By.xpath("//select[@id='customer_edit_form_color']"));
		Select sel =new Select(ele);
		ele.click();
		sel.selectByVisibleText("Silver");
		Thread.sleep(1999);
		driver.findElement(By.xpath("//button[@id='form_modal_save']")).click();
		Thread.sleep(4999);
		
		
		
		
		Thread.sleep(1999);
		driver.close();
	}

}
