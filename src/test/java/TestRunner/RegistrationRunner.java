package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\applicationfeature\\Registration.feature"},
		glue = {"Stepdefination","Hooks"},
		plugin= {"pretty","html:target/cucumber-reports/Registrationreports.html"}
		
		
		)

public class RegistrationRunner extends AbstractTestNGCucumberTests
{

	
}
