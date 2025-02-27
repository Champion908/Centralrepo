package appfeature;

import Pages.SearchPage;
import io.cucumber.java.en.When;
import qa.DriverFactory;

public class SearchSteps 
{
SearchPage searchpage = new SearchPage(DriverFactory.getDriver());
	@When("User enters productname as {string}")
	public void user_enters_productname_as(String prdname) 
	{
	   searchpage.searchproduct(prdname);
	}

	@When("Click on search button")
	public void click_on_search_button() 
	{
		searchpage.clickonSearch();
	}
}
