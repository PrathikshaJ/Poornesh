package testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Demo extends Generic {

	
	@Test
	public void test()
	{
		driver.findElement(By.id("email")).sendKeys("hello");
		driver.findElement(By.id("pass")).sendKeys("bye");
		driver.findElement(By.name("login")).click();
		System.out.println("hi");
	}
}
