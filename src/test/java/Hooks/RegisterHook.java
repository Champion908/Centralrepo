package Hooks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
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
	
    @After(order = 2)
	public void tearDown(Scenario scenario) {
		boolean isScenarioFailed = scenario.isFailed();

		if (isScenarioFailed) {
			String scenarioName = scenario.getName();

			String name = scenarioName.replace(" ", "_");

			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] source = ts.getScreenshotAs(OutputType.BYTES);

			scenario.attach(source, "image/png", name);
		}
	}


    @After(order = 1)
    public void browserclose() 
    {
    	driver.quit();
    	
    }
	
}
