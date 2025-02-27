package Stepdefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pages.Registration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import qa.DriverFactory;

public class Stepregister 
{
	Registration register = new Registration(DriverFactory.getDriver());
	

	@Given("User is at the landing page")
	public void user_is_at_the_landing_page()
	{
	  WebDriver driver = DriverFactory.getDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
	}


	@Then("Page title should contain {string}")
	public void page_title_should_contain(String HYDTuto) 
	{
		
		String tile = register.getTitleofPage();
		boolean ispresent = tile.contains("HYR Tutorials");
		Assert.assertFalse(ispresent);
	}
	

	@When("Enter the First Name {string}")
	public void enter_the_first_name(String FN) 
	{
		register.EnterFirstName(FN);
	}

	@When("Enter the Last Name {string}")
	public void enter_the_last_name(String LN)
	{
	    register.LastFirstName(LN);
	}

	@When("Enter the Email {string}")
	public void enter_the_email(String EM) 
	{
	   register.Email(EM);
	}

	@When("Enter the Password {string}")
	public void enter_the_password(String PW) 
	{
	   register.Password(PW);
	}

	@When("Enter the Repeat Password {string}")
	public void enter_the_repeat_password(String RPW)
	{
		  register.RepeatPassword(RPW);
	}

	@When("Click on reset")
	public void click_on_reset() 
	{
		
	    register.Reset();
	}


	
	
}


