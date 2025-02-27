package TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"C:\\Users\\Admin\\eclipse-workspace\\ATTBDDCucumberBasic\\src\\test\\java\\applicationtest\\CampaignStatus.feature"},
		
		glue = {"Stepdefination"},
		
		plugin = {"pretty"},
		
		tags= "@regression",
		dryRun = true
		
		
		)

public class CampignRunner extends AbstractTestNGCucumberTests
{

	
}
