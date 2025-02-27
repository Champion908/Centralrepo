package appfeature;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import qa.DriverFactory;

public class AppHooks 
{
	
    WebDriver driver;
	@Before
	public void launchBrowser() throws IOException 
	{
		Properties prop = new Properties();
		
		String path = System.getProperty("user.dir") + "//src/test/resources//config.properties";
		
		
		FileInputStream file = new FileInputStream(path);
		
		prop.load(file);
		String browsername = prop.getProperty("browser");
		
		String Maven_browsername= System.getProperty("clibrowser");
		
		if(Maven_browsername!=null) 
		{
			browsername = Maven_browsername;
		}
		
		DriverFactory df = new DriverFactory();
		
		driver = df.initBrowser(browsername);
		
		driver.manage().window().maximize();
	}
	
	@After
	
	public void browserclose() 
	{
		driver.quit();
	}
}
