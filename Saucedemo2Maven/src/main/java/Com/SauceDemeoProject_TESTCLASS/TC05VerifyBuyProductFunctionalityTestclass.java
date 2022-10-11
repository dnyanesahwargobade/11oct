package Com.SauceDemeoProject_TESTCLASS;
import org.testng.Assert;
import Com.SauceDemoProject_POMCLASS.BuyPOMclass;
import Com.SauceDemoProject_POMCLASS.HomePOMclass;

public class TC05VerifyBuyProductFunctionalityTestclass extends Baseclass
{

	
	public void VerifyBuyProductFunctionality()
	{
		// bagproduct:
		HomePOMclass k = new HomePOMclass (driver);
		System.out.println("bag product is selected");
		k.clickBagButton();
     	k.clickoncartmethod();                                                                                                                                           
		System.out.println("click on cart method ");
	
		//buy product
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
	 
	   System.out.println("apply validation");
		
	 
	}

}
