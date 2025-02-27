package appfeature;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		//features = {"C:\\Users\\Admin\\eclipse-workspace\\ATTBDDCucumberBasic\\src\\test\\resources\\applicationfeature"},
		
		features= {"@target/failedrun.txt"},
		
		glue = {"appfeature"},
		
		plugin = {"pretty","rerun:target/failedrun.txt"},
		
		
		dryRun = true
		
		
		)
		
public class AmazonFailedRunner extends AbstractTestNGCucumberTests
{

}



