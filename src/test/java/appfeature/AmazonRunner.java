package appfeature;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"C:\\Users\\Admin\\eclipse-workspace\\ATTBDDCucumberBasic\\src\\test\\resources\\applicationfeature"},
		
		glue = {"appfeature"},
		
		plugin = {"pretty"},
		
		//tags = "@regression",
		
		dryRun = false
		
		)
		
public class AmazonRunner extends AbstractTestNGCucumberTests
{

}
