package Com.SauceDemeoProject_TESTCLASS;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com.SauceDemoProject_POMCLASS.HomePOMclass;
import Com.SauceDemoProject_POMCLASS.LoginPOMclass;

public class TC06_verifyFiltertestclass
{
	@Test
	public void Filter()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

        System.out.println("browser is opened");
		
        driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("sauce demo url is opened");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		LoginPOMclass ks = new LoginPOMclass (driver);
		ks.sendusername();
		System.out.println("username enter");

		ks.sendPassword();
		System.out.println("password enter");

		ks.clickonLoginbutton();
		System.out.println("click login button ");
	
		HomePOMclass hp = new HomePOMclass (driver);
		hp.clickonmainubutton();
		hp.clickfilter();
		List<String>expectedtitle=new ArrayList <String> ();
		Collections.addAll(expectedtitle,"Sauce Labs Backpack","Sauce Labs Bike Light","Sauce Labs Bolt T-Shirt","Sauce Labs Fleece Jacket","Sauce Labs Onesie","Test.allTheThings() T-Shirt (Red)");
		Assert.assertEquals(expectedtitle, hp.gettitle());
	}

}
