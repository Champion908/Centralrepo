package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"C:\\Users\\Admin\\eclipse-workspace\\ATTBDDCucumberBasic\\src\\test\\java\\applicationtest\\LoginWithData.feature"},
		
		glue = {"Stepdefination"},
		plugin= {"pretty"}
		
		
		)

public class LoginWithDataRunner extends AbstractTestNGCucumberTests
{

}
