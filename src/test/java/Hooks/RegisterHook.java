package Hooks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import qa.DriverFactory;

public class RegisterHook 
{
	
		
	WebDriver driver;
    @Before
	public void launchbrowaer() throws IOException
	{
		Properties prop = new Properties();
		
		String path = System.getProperty("user.dir")+"//src//test//resources//config.properties";
		
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		String browsername =prop.getProperty("browser");
       DriverFactory df = new DriverFactory();
		
		driver = df.initBrowser(browsername);
	}
	
    @After
    public void browserclose() 
    {
    	driver.quit();
    	
    }
	
}
