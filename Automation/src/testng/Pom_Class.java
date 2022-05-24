package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Class {
	
	@FindBy(id="firstName")
	private WebElement fname;
	
	@FindBy(id="lastName")
	private WebElement lname;
	
	
	@FindBy(id="userEmail")
	private WebElement email;
	
	
	@FindBy(xpath="//label[.='Male']")
	private WebElement maleRadio;
	
	@FindBy(xpath="//label[.='Female']")
	private WebElement femaleRadio;
	
	@FindBy(xpath="//label[.='Other']")
	private WebElement otherRadio;
	
	@FindBy(id="userNumber")
	private WebElement mobno;
	
	@FindBy(id="userNumber")
	private WebElement dob;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;
	
	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
	private WebElement dd1;
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	private WebElement dd2;
	
	@FindBy(xpath="//div[.='15']")
	private WebElement date;
	
	@FindBy(id="subjectsContainer")
	private WebElement subject;
	
	@FindBy(xpath="//label[.='Sports']")
	private WebElement cbox1;
	
	@FindBy(xpath="//label[.='Reading']")
	private WebElement cbox2;
	
	@FindBy(xpath="//label[.='Music']")
	private WebElement cbox3;
	
	@FindBy(id="state")
	private WebElement stateddown;
	
	@FindBy(id="city")
	private WebElement cityddown;
	
	@FindBy(id="submit")
	private WebElement submitbutton;
	
	
	public Pom_Class(WebDriver driver)
	{
       PageFactory.initElements(driver, this);

	}
	
	public void first(String uname)
	{
		fname.sendKeys(uname);
	}

	
	public void last(String lame)
	{
		lname.sendKeys(lame);
	}
	
	public void mail(String mailid)
	{
		email.sendKeys(mailid);
		
	}
	
	public void mradio()
	{
		maleRadio.click();
		
	}
	
	public void fradio()
	{
		femaleRadio.click();
		
	}
	
	public void oradio()
	{
		otherRadio.click();
		
	}
	
	public void mobile(String mob)
	{
		mobno.sendKeys(mob);
		
	}
	public void dateofbirth()
	{
		dob.click();
		
	}
	
	public WebElement getdd1()
	{
		return dd1;
	}
	
	public WebElement getdd2()
	{
		return dd2;
	}
	
	public void dateselect()
	{
		date.click();
		
	}
	
	public void subjectclick()
	{
		subject.click();
	}
	
	public void firstCheck()
	{
		cbox1.click();
	}

	public void secondCheck()
	{
		cbox2.click();
	}

	
	public void thirdCheck()
	{
		cbox3.click();
	}

	
	
}
