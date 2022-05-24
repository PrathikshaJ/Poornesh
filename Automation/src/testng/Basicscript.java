package testng;

import org.testng.annotations.Test;

public class Basicscript {
	
	@Test(priority=0, invocationCount = 4,enabled=true)
   public void signup()
   {
		System.out.println("signup please");
		
   }
	 
	@Test(priority=1, invocationCount=1, enabled=true,dependsOnMethods = "signup")
	public void login()
	{
		System.out.println("I have logged in");
	}
	
	@Test(dependsOnMethods = "login")
	public void order()
	{
		System.out.println("Make an Order");
	}
}
