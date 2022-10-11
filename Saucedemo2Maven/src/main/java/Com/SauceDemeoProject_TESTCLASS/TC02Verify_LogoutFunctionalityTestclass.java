package Com.SauceDemeoProject_TESTCLASS;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.SauceDemo.UtilityClass.Screenshotclass;

public class TC02Verify_LogoutFunctionalityTestclass extends Baseclass
{
	
	@Test
	public void Verify_LogoutFunctionality() throws IOException
	{
		
        System.out.println("apply the validations");
		
		String expectedTitle ="Swag Labs";
	
		String actualTitle = driver.getTitle();
		
		 Assert.assertEquals(actualTitle, expectedTitle);
		 Screenshotclass.takeScreenshot(driver,"logoutpage");
	}

}
