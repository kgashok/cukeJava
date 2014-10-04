package cucumber.examles.java.helloworld;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class frequentStepsdefs {
	private FreqCounter fc;
	private String listAsString;
	private String out;
	
	@Given("^a list that is \"([^\"]*)\"$")
	public void a_list_that_is(String list) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    // throw new PendingException();
		listAsString = new String(list); 
	    
	}
	
	@When("^the list is processed$")
	public void the_list_is_processed() throws Throwable {

		out = findMostFrequent(); 
	}

	private String findMostFrequent() {
		// return null;		
		return listAsString;
	}

	@Then("^the output is \"([^\"]*)\"$")
	public void the_output_is(String output) throws Throwable {

		assertEquals (out, output);
	}

}
