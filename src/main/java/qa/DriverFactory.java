package qa;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory 
{
	static WebDriver driver;

	public WebDriver initBrowser(String browsername) 
	{
		if(browsername.equals("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		else if(browsername.equals("Firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		return driver;
		
	}
	
	public static WebDriver getDriver() 
	{
		return driver;
	}
	
}
