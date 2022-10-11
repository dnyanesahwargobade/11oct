package Com.SauceDemoProject_POMCLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMclass 
{
	//1. driver declared.
	WebDriver driver;
	
	//2.find element.
	
	@FindBy(xpath="//input[@id ='user-name']")
	WebElement username;
	
	//3. create method.
	
	public void sendusername()
	{
		username.sendKeys("standard_user");
		
	}
		
	@FindBy(xpath ="//input[@id ='password']")	
		WebElement password;
		
		public void sendPassword()
		{
			password.sendKeys("secret_sauce");
			
		}
		
		@FindBy(xpath = "//input[@id ='login-button']")
		WebElement loginbutton;
		
		public void clickonLoginbutton()
		{
			loginbutton.click();
		}
		
		//4. create constructor.
		
		 public LoginPOMclass (WebDriver driver)
		 {
			this.driver = driver;
			
			PageFactory.initElements(driver, this);
	}
}
