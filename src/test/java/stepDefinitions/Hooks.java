package stepDefinitions;



import io.cucumber.java.After;
import io.cucumber.java.Before;



public class Hooks
{
	@Before("@frontend")
	public void setUpFrontend()
	{
		System.out.println("@Before for front end");
	}


	@Before("@backend")
	public void setUpBackend()
	{
		System.out.println("@Before for back end");
	}


	@After("@frontend or @backend")
	public void tearDown()
	{
		System.out.println("@After for front end and back end");
	}
}
