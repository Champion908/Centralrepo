package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class ApplicationHook
{

	@Before
	public void beforeHook()
	{
		System.out.println("Before hook is executing");
	}
	
	@After
	public void afterHook()
	{
		System.out.println("After hook is executing");
	}
	@BeforeStep
	public void beforestepHook()
	{
		System.out.println("Beforestep hook is executing");
	}
	
	@AfterStep
	public void afterstepHook()
	{
		System.out.println("Afterstep hook is executing");
	}	
}
