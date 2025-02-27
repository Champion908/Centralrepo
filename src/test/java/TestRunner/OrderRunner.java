package TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"C:\\Users\\Admin\\eclipse-workspace\\ATTBDDCucumberBasic\\src\\test\\java\\applicationtest\\Order.feature"},
		
		glue = {"Stepdefination"},
		plugin= {"pretty"}
		
		
		)

public class OrderRunner extends AbstractTestNGCucumberTests
{

}
