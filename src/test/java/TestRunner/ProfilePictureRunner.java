package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"C:\\Users\\Admin\\eclipse-workspace\\ATTBDDCucumberBasic\\src\\test\\java\\applicationtest\\ProfilePicture.feature"},
		
		glue = {"Stepdefination","Hooks"},
		plugin= {"pretty"}
		
		
		)
public class ProfilePictureRunner extends AbstractTestNGCucumberTests
{

}
