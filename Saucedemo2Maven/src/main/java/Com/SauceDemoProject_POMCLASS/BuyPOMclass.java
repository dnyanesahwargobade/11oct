package Com.SauceDemoProject_POMCLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyPOMclass 
{
	//.driver declared.
	
	WebDriver driver;
	
	//element find
	
	@FindBy(xpath="//button[@id='checkout']")
	WebElement checkout;
	
	// method.
	public void clickoncheckoutbutton()
	{
	   checkout.click();
	}
	
	@FindBy(xpath="//input[@id='first-name']")
	WebElement Firstname;
	
	public void clickonfirstname()
	{
		Firstname.sendKeys("dnyaneshwar");
	}
	
	@FindBy(xpath="//input[@id='last-name']")
	WebElement lastname;
	
	public void clickonlastname()
	{
		lastname.sendKeys("gobade");
	}
	
	@FindBy(xpath="//input[@id='postal-code']")
	WebElement pincode;
	
	public void clickonpincode()
	{
		pincode.sendKeys("411033");
	}
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement continuebutton;
	public void clickoncontinebutton()
	{
		continuebutton.click();
	}
	
	@FindBy(xpath="//button[@id='finish']")
	WebElement finish;
	
	public void clickonfinish()
	{
		finish.click();
	}
	
	@FindBy(xpath="//span[text()='Checkout: Complete!']")
	WebElement completeorder;
	public String gettextcompleteorder()
	{
		String text = completeorder.getText();
		return text;
		
	}
	
	// constructor
	
	
	  public BuyPOMclass (WebDriver driver)
	 {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	 }
	
	
	
	
}
