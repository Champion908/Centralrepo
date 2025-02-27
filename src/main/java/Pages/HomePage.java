package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver driver;

	@FindBy(xpath="//a[@id='nav-cart']")
	private WebElement Carticon;
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	private WebElement accountsignin;
	
	@FindBy(xpath="//*[@id='nav-flyout-ya-signin']//*[@class='nav-action-signin-button']")
	private WebElement signhoverbutton;
	
	@FindBy(xpath="//input[@id='ap_email']")
	private WebElement emailfield;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	private WebElement continuebutton;
	
	@FindBy(xpath="//input[@id='ap_password']")
	private WebElement passwordfield;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement signbutton;
	
	public HomePage (WebDriver driver) 
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getTitleofPage() 
	{
		String title = driver.getTitle();
		return title;
	}
	
	public boolean verifyCart() 
	{
		boolean isdisplay = Carticon.isDisplayed();
		return isdisplay;
	}
	
	public void goToSignPage() 
	{
		Actions act = new Actions(driver);
		act.moveToElement(accountsignin).perform();
		signhoverbutton.click();
		
	}
	
	public void enterUserName(String uname) 
	{
		emailfield.sendKeys(uname);
		continuebutton.click();
	}
	
	public void finalSignIn(String pwd) 
	{
		passwordfield.sendKeys(pwd);
		signbutton.click();
	}
	
	
	
}
