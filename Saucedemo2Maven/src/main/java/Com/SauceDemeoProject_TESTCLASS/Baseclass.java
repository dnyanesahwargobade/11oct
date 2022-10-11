package Com.SauceDemeoProject_TESTCLASS;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Com.SauceDemoProject_POMCLASS.LoginPOMclass;

public class Baseclass 
{		
		Logger log = Logger.getLogger("Saucedemo2Maven");
		WebDriver driver;
		@BeforeMethod
		public void setup()
		
		{

    		System.setProperty("webdriver.chrome.driver","./Driverfile\\chromedriver.exe");
    	    driver = new ChromeDriver();

    		 PropertyConfigurator.configure("log4j.properties");
    		 log.info("browser is opened");
    		   
	        driver.manage().window().maximize();
	        log.info("Browser is maximized");
			
			driver.get("https://www.saucedemo.com/");
			log.info("sauce demo url is opened");
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			// HomePage Activity.
			
			LoginPOMclass ks = new LoginPOMclass (driver);
			ks.sendusername();
			log.info("username enter");

			ks.sendPassword();
			log.info("password enter");

			ks.clickonLoginbutton();
			log.info("click login button ");
			
		}	
			@AfterMethod
			public void teardown()
			{
			 driver.quit();
			 log.info(" browser is closed");
			 
			 log.info("end of program");
			
			
	}

}
