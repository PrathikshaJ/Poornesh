package PomScript;

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
	private WebElement uEmail;
	
	@FindBy(xpath="//label[.='Male']")
	private WebElement mRadio;
	
	
	@FindBy(xpath="//label[.='Female']")
	private WebElement fRadio;
	
	@FindBy(xpath="//label[.='Other']")
	private WebElement oRadio;
	
	@FindBy(id="userNumber")
	private WebElement uNo;
	
	@FindBy(id="dateOfBirthInput")
	private WebElement dateofbirth;
	
	@FindBy(id="subjectsInput")
	private WebElement Sub;
	
	@FindBy(xpath="//option[.='December']")
	private WebElement mon;
	
	@FindBy(xpath="//option[.='1995']")
	private WebElement yea;
	
	@FindBy(xpath="//div[.='15']")
	private WebElement dat;
	
	@FindBy(xpath="//label[.='Sports']")
	private WebElement spRadio;
	
	@FindBy(xpath="//label[.='Reading']")
	private WebElement reRadio;
	
	@FindBy(xpath="//label[.='Music']")
	private WebElement muRadio;
	
	@FindBy(id="uploadPicture")
	private WebElement upic;
	
	@FindBy(id="currentAddress")
	private WebElement cAdd;
	
	@FindBy(xpath="//div[.='Select State']")
	private WebElement stateddown;
	
	@FindBy(xpath="//div[.='Select City']")
	private WebElement cityddown;
	
	@FindBy(id="submit")
	private WebElement subm;
	
	
	
	public Pom_Class(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

	public void firstname(String uname)
	{
		fname.sendKeys(uname);
		
	}
	
	public void lastname(String lame)
	{
		lname.sendKeys(lame);
	}
	
	public void Email(String e)
	{
		uEmail.sendKeys(e);
	}
	
	public void maleC()
	{
		mRadio.click();
		
	}
	
	
	public void femaleC()
	{
		fRadio.click();
	}
	
	public void otherC()
	{
		oRadio.click();
	}
	
	public void userno(String m)
	{
		uNo.sendKeys(m);
	}
	
	public void dob()
	{
		dateofbirth.click();
	}
	
	public void month()
	{
		mon.click();
	}
	
	
	public void year()
	{
		yea.click();
	}
	
	public void date()
	{
		dat.click();
	}
	
	public void sportsRadio()
	{
		spRadio.click();
	}
	
	public void readingRadio()
	{
		reRadio.click();
	}
	
	public void musicRadio()
	{
		muRadio.click();
	}
	
	public void BrowsePic(String picture)
	{
		upic.sendKeys(picture);
	}
	
	public void currectAdd(String Address)
	{
		cAdd.sendKeys(Address);
	}
	
	public void dd1()
	{
		stateddown.click();
	}
	
	
	public void dd2()
	{
		cityddown.click();
	}
	
	
	
	
	
	
}
