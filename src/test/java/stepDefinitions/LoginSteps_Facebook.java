package stepDefinitions;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import stepDefinitions.*;
import utilities.*;





public class LoginSteps_Facebook extends BaseClass {
	@Given("user launches the browser")
	public void user_launches_the_browser() {
		
		loginpage=new LoginPage(Helper_Facebook.getDriver());
	}

	@Given("User navigates to the Facebook login page at {string}")
	public void user_navigates_to_the_facebook_login_page_at(String url)  throws InterruptedException {
	//string="www.facebook.com";
    Thread.sleep(3000);
    Helper_Facebook.openFacebookPage(url);
    
   
}

	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) throws InterruptedException {
    
		
		loginpage=new LoginPage(Helper_Facebook.getDriver());
    	username=Helper_Facebook.GetUserName();
    	password=Helper_Facebook.GetUserPassword();
    
   
		loginpage.SetUserName(username);
		loginpage.SetPassword(password);
	
}

	@Then("User should be able to login by clicking on the login button")
	public void user_should_be_able_to_login_by_clicking_on_the_login_button() throws InterruptedException {
		loginpage=new LoginPage(Helper_Facebook.getDriver());
		loginpage.buttonClick();
		

	
}


}
