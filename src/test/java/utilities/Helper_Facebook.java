package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Helper_Facebook {
	
private static Helper_Facebook Helper;
	
	private static WebDriver driver;
	
	public final static int TIMEOUT=5;
	
	private Helper_Facebook()
	{
		WebDriverManager.chromedriver().setup();
		
		driver =new ChromeDriver();
		new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		
		driver.manage().window().maximize();
	}
	
	public static void openFacebookPage(String url)
	{
		driver.get(url);
	}
	
	public static String getTitle()
	{
		return driver.getTitle();
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	public static void navigateBack()
	{
		driver.navigate().back();
	}
	
	public static void setUpDriver()
	{
		if(Helper==null)
		{
			Helper =new Helper_Facebook();
		}
	}
	public static void tearDown()  
	{
		
		if(driver!=null)
		{
		
			driver.close();
			driver.quit();
		}
		Helper=null;
	}
	
	public static String GetUserName()
	{
		return "FacebookUserName";
	}
	public static String GetUserPassword()
	{
		return "Facebookpassword";
	}
	
	

}
