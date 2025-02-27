package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationfeature\\Registration.feature"},
		glue = {"Stepdefination","Hooks"},
		plugin= {"pretty"}
		
		
		)

public class RegistrationRunner extends AbstractTestNGCucumberTests
{

	
}
