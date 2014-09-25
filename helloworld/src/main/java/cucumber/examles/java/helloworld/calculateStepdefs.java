package cucumber.examles.java.helloworld;

import static org.junit.Assert.assertEquals;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class calculateStepdefs {
	private Calculator c;
	private String out;

	@Given("^the input \"([^\"]*)\"$")
	public void the_input(String input) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    // throw new PendingException();
		c = new Calculator(input);
		
	}
	
	@When("^the variable \"([^\"]*)\" is set to value (\\d+)$")
	public void the_variable_is_set_to_value(String variable, int value) throws Throwable {
		c.SetVariable(variable, value);

	}

	@When("^the variable \"([^\"]*)\" is not set$")
	public void the_variable_is_not_set(String variable) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    // throw new PendingException();
	    c.isVariableSet(variable);
	}

	
	@When("^the calculator is run$")
	public void the_calculator_is_run() throws Throwable {
		out = c.Run();
	}

	@Then("^the output should be \"([^\"]*)\"$")
	public void the_output_should_be(String output) throws Throwable {
		assertEquals (out, output);		
	}
		
}
