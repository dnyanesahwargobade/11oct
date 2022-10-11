package Com.SauceDemeoProject_TESTCLASS;
import org.testng.Assert;
import org.testng.annotations.Test;
import Com.SauceDemoProject_POMCLASS.HomePOMclass;

public class TC04verifyBagProductFunctionalityTestclass extends Baseclass
{
	@Test
	  public void verifyBagProductFunctionality()
		
	   {
		
		// bagproduct:
		HomePOMclass k = new HomePOMclass (driver);
		k.clickBagButton();
		System.out.println("bag product is selected");
     	k.clickoncartmethod();                                                                                                                                           
		System.out.println("click on cart method ");
		
		// validation:
	    String expectedproduct ="1";
	    String actualproduct = k.getCartTextMethod();
	    System.out.println("actualproduct>"+ actualproduct);
	    System.out.println("apply validation");
	    
	    Assert.assertEquals(actualproduct, expectedproduct);
	
}

}
