package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage 
{

	WebDriver driver;

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement Searchfield;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement searchbutton;
	
	
	public SearchPage(WebDriver driver) 
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	
	}
	
	public void searchproduct(String text) 
	{
		Searchfield.sendKeys(text);
		
	}
	
	public void clickonSearch() 
	{
		searchbutton.click();
	}
	
	
	
}
