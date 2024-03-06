package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
	
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//input[@id='email']")

WebElement emailId;

@FindBy(xpath="//input[@name='pass']")
WebElement password;
@FindBy(xpath="//button[@type='submit']")
WebElement buttonLogin;


public void SetUserName(String uName) throws InterruptedException
{
emailId.clear();
Thread.sleep(3000);
emailId.sendKeys(uName);


}

public void SetPassword(String upassword) throws InterruptedException
{


Thread.sleep(3000);
password.sendKeys(upassword);
}




public void buttonClick() throws InterruptedException
{

Thread.sleep(3000);
buttonLogin.click();
Thread.sleep(3000);

}




}
