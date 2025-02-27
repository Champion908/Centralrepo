package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration 
{
    WebDriver driver;
	@FindBy(xpath="//*[text()='First Name ']/following-sibling::input[1]")
	WebElement FirstName;
	
	@FindBy(xpath="//*[text()='Last Name']/following-sibling::input[1]")
	WebElement LastName;
	
	@FindBy (xpath="//*[text()='Email']/following-sibling::input[1]")
	WebElement Email;
	
	@FindBy (xpath="//*[text()='Password']/parent::div/following-sibling::div[1]/child::input")
	WebElement Password;
	
	@FindBy (xpath="//*[text()='Repeat Password']/following-sibling::input")
	WebElement RepeatPassword;
	
	@FindBy(xpath="//button[text()='Clear']")
	WebElement Reset;
	
	
	public Registration(WebDriver driver) 
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public String getTitleofPage() 
	{
		String title= driver.getTitle();
		return title;
	}
	
	public void EnterFirstName(String FN) 
	{
		FirstName.sendKeys(FN);
	}
	
	public void LastFirstName(String LN) 
	{
		LastName.sendKeys(LN);
	}
	
	public void Email(String EM) 
	{
		 Email.sendKeys(EM);
	}
	
	public void Password(String PW) 
	{
		Password.sendKeys(PW);
	}
	public void RepeatPassword(String RPW) 
	{
		RepeatPassword.sendKeys(RPW);
	}
	
	public void Reset() 
	{
		Reset.click();
	}
	
	
}



	



