package appfeature;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import qa.DriverFactory;

public class HomePageSteps 
{
	HomePage homepage = new HomePage(DriverFactory.getDriver());
	@Given("User is at the landing page")
	public void user_is_at_the_landing_page() 
	{
	WebDriver driver = DriverFactory.getDriver();	
	driver.get("https://amazon.in");
		
	}
	
	@Then("Page title should contains {string}")
	public void page_title_should_contains(String titlesString) 
	{
		 
		String title = homepage.getTitleofPage();
		boolean ispresent =  title.contains(titlesString);
		Assert.assertFalse(ispresent);
	}
	
	@Then("Cart icon should get display")
	public void cart_icon_should_get_display() 
	{
	    boolean isdisplay = homepage.verifyCart();
	    Assert.assertTrue(isdisplay);
    }
	
	@When("User click on signin button")
	public void user_click_on_signin_button() 
	{
	    homepage.goToSignPage();
	}
		
	@When("User enters as {string}")
	public void user_enters_as(String uname) 
	{
	   homepage.enterUserName(uname);
	    
	}

	@When("User enters password as {string} with Signin")
	public void user_enters_password_as_with_signin(String pwd) 
	{
	
		homepage.finalSignIn(pwd);
		    
	}	
}
