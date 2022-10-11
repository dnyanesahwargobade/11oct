package Com.SauceDemoProject_POMCLASS;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePOMclass 
{
	//1.
	WebDriver driver;
	Select s;
	//2.menu button
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement mainubutton;
	
	//3.method menu button
	public void clickonmainubutton()
	{
		mainubutton.click();
	}
	
	// logout button
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	WebElement logout;
	
	public void clickonlogoutButton()
	{
		logout.click();
	}
	
	//bag product.
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	  WebElement bagButton;
		
	  public void clickBagButton()
	{
	   bagButton.click();
	}
	  // add to cart element.
	  @FindBy(xpath="//a[@class ='shopping_cart_link']")
	  WebElement cart;
	  
	  public String getCartTextMethod()
	  {
		  return cart.getText();
	  }
	  
	 // click on cart element.
	  public void clickoncartmethod()
	  {
		  cart.click();
	  }
	  
	  //  multiple product add to cart 
	  
	  @FindBy(xpath="//button[text()='Add to cart']")
	  List<WebElement> allproduct;
	  
	  public void clickallproduct()
	  {
		  for (WebElement e : allproduct) 
		  {
			  e.click();
		  }
	  }
	  
	  // filter element.
	  
	 @FindBy(xpath="//select[@class='product_sort_container']")
	  WebElement filter;
      
	 public void clickfilter()
	 {
		 filter.click();
		 s.selectByVisibleText("Name (A to Z)");
	 }
	 
	 @FindBy(xpath="//div[@class='inventory_item_name']")
	 List<WebElement>Title;
	 public List<String> gettitle()
	 {
		 List<String>Alltitle=new ArrayList<String>();
	 
		for(WebElement i: Title) 
		{
			Alltitle.add(i.getText());
		}
		return  Alltitle;
	 }
			
	 
	//4.constructor
	
	 public HomePOMclass (WebDriver driver)
	 {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		s = new Select(filter);
	 }
	 
	  
}