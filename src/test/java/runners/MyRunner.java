package runners;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features   = "src/test/java/features",
				 glue       = "stepDefinitions",
				 strict 	= true)
public class MyRunner extends AbstractTestNGCucumberTests
{
}
