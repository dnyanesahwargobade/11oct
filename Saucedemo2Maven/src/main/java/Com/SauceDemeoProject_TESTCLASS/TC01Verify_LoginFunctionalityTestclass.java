package Com.SauceDemeoProject_TESTCLASS;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC01Verify_LoginFunctionalityTestclass extends Baseclass
{
	@Test
	public void  verifyLoginfunctionality () 
	{
		//Homepage.
		System.out.println("apply the validations");
		
		String expectedTitle ="Swag Labs";
	
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		 
 	}
}
