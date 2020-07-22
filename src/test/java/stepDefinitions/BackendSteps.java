package stepDefinitions;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;



public class BackendSteps
{
	//	Before and After methods can be commented out
	//	and replaced by common before/after methods
	//	in a separate file (Hooks.java, in this case)
	
	
//	@Before("@backend")
//	public void setUp()
//	{
//		System.out.println("@Before for back end");
//	}
//
//
//	@After("@backend")
//	public void tearDown()
//	{
//		System.out.println("@After for back end");
//	}


	//  back end tests
	@Given("^Back end given$")
	public void Back_end_given()
	{
		System.out.println("Back end given");
	}


	@When("^Back end when$")
	public void Back_end_when()
	{
		System.out.println("Back end when");
	}


	@Then("^Back end then$")
	public void Back_end_then()
	{
		System.out.println("Back end then");
	}
}
