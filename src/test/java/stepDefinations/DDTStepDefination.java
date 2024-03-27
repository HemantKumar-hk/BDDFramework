package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DDTStepDefination 
{
	@Given("I want to write a step with {string}")
	public void i_want_to_write_a_step_with(String string) 
	{
	    System.out.println("Steps with " + string);
	    
	}

	@When("I check for the {string} in step")
	public void i_check_for_the_in_step(String string) 
	{
		System.out.println("Check Steps with " + string); 
	    
	}

	@Then("I verify the {string} in step")
	public void i_verify_the_in_step(String string) 
	{
		System.out.println("Verify Steps with " + string);
	    
	}

}
