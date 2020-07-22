package stepDefinitions;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;



public class FrontendSteps
{
	//	Before and After methods can be commented out
	//	and replaced by common before/after methods
	//	in a separate file (Hooks.java, in this case)
	
	
//	@Before("@frontend")
//	public void setUp()
//	{
//		System.out.println("@Before for front end");
//	}
//
//
//	@After("@frontend")
//	public void tearDown()
//	{
//		System.out.println("@After for front end");
//	}


	//  front end tests
	@Given("^Front end given$")
	public void Front_end_given()
	{
		System.out.println("Front end given");
	}


	@When("^Front end when$")
	public void Front_end_when()
	{
		System.out.println("Front end when");
	}


	@Then("^Front end then$")
	public void Front_end_then()
	{
		System.out.println("Front end then");
	}
}
