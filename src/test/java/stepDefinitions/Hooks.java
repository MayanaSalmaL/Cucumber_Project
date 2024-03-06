package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.Helper_Facebook;

public class Hooks {
	
	@Before
	public static void setUp()
	{
		Helper_Facebook.setUpDriver();
		
		
	}
	@After 
	public static void tearDown(Scenario scenario) throws InterruptedException
	{
		if(scenario.isFailed())
		{
			final byte[] screenshot=((TakesScreenshot)Helper_Facebook.getDriver()).getScreenshotAs(OutputType.BYTES);
			
			scenario.attach(screenshot,"image/png",scenario.getName());
		}
		
		Helper_Facebook.tearDown();
	}

}
