package Com.SauceDemeoProject_TESTCLASS;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.SauceDemoProject_POMCLASS.BuyPOMclass;
import Com.SauceDemoProject_POMCLASS.HomePOMclass;

public class TESTclass extends Baseclass
{
	Logger log = Logger.getLogger("Saucedemo2Maven");

	@Test(priority=1)
	public void verifylogin()
	{
        System.out.println("apply the validations");
		
		String expectedTitle ="Swag Labs";
	
		String actualtitle = driver.getTitle();
		
		Assert.assertEquals(actualtitle, expectedTitle);
		
	}
	
	@Test(priority=3)
	public void verifylogout()
	{
		HomePOMclass ts = new HomePOMclass (driver);
		ts.clickonmainubutton();
		ts.clickonlogoutButton();
		 PropertyConfigurator.configure("log4j.properties");
		 
		 log.info ("apply the validation");
		
		String expectedTitle ="Swag Labs";
		
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		}

	@Test(priority=2)
	   public void verifyaddtocartallproduct()
	{
		HomePOMclass k = new HomePOMclass (driver);  
	    k.clickallproduct();
		String expectedproduct ="6";
		String actualproduct = k.getCartTextMethod();
		log.info("actualproduct>"+actualproduct);
										
		log.info("apply validation");
		Assert.assertEquals(actualproduct, expectedproduct);
								
		
	}
	
	@Test(priority=4)
	public void verifybagproduct()
	{
		HomePOMclass k = new HomePOMclass (driver);
		k.clickBagButton();
		System.out.println("bag product is selected");
     	k.clickoncartmethod();                                                                                                                                           
		System.out.println("click on cart method ");
		String expectedproduct ="1";
		String actualproduct = k.getCartTextMethod();
		log.info("actualproduct>"+ actualproduct);
		
		log.info("apply validation");
		Assert.assertEquals(actualproduct, expectedproduct);
		
	}
	
	@Test(priority=5)
	public void verifybuyproduct() throws InterruptedException
	{
		HomePOMclass k = new HomePOMclass (driver);
		k.clickBagButton();
		System.out.println("bag product is selected");
     	k.clickoncartmethod();                                                                                                                                           
     	log.info("click on cart method ");
	
		//buy 
		
		BuyPOMclass d = new BuyPOMclass (driver);
		d.clickoncheckoutbutton();
		d.clickonfirstname();
		d.clickonlastname();
		d.clickonpincode();
		d.clickoncontinebutton();
		d.clickonfinish();
		
		//validation 
	
	   String expected = "CHECKOUT: COMPLETE!" ;
	   String actual= d.gettextcompleteorder();
	 
	   log.info("apply validation");
		Assert.assertEquals(actual, expected);
		
	}
	}

