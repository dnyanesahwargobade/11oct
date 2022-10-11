package Com.SauceDemeoProject_TESTCLASS;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.SauceDemoProject_POMCLASS.HomePOMclass;

public class TC03VerifyAddtoCartAllProductFunctionalityTestclass extends Baseclass
{
	@Test
	public void VerifyAddtoCartAllProductFunctionality()
	{
		
		// homepage:
		HomePOMclass k = new HomePOMclass (driver);   
	    k.clickallproduct();
	    
		// validation:
		String expectedproduct ="6";
		String actualproduct = k.getCartTextMethod();
		
		System.out.println("actualproduct>"+actualproduct);
		
		System.out.println("apply validation");
		
		Assert.assertEquals(actualproduct, expectedproduct);
	}
}
