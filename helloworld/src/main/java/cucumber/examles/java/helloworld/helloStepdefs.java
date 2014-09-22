package cucumber.examles.java.helloworld;

import static org.junit.Assert.assertEquals;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class helloStepdefs {
	private Hello hello;
	private String hi;

	@Given("^I have a hello app with \"([^\"]*)\"$")
	public void I_have_a_hello_app_with(String greeting) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    // throw new PendingException();
		hello = new Hello(greeting);
	}

	@When("^I ask it to say hi$")
	public void I_ask_it_to_say_hi() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    // throw new PendingException();
		hi = hello.sayHi();
	}
	
	@When("^I ask it to say hi to \"([^\"]*)\"$")
	public void I_ask_it_to_say_hi_to(String name) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    // throw new PendingException();
		hi = hello.sayHiTo(name);
	}
	
	@Then("^it should answer with \"([^\"]*)\"$")
	public void it_should_answer_with(String expectedHi) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    // throw new PendingException();
		assertEquals(expectedHi, hi);
	}
	
	@When("^I ask it to say hi to \"([^\"]*)\" and \"([^\"]*)\"$")
	public void I_ask_it_to_say_hi_to_and(String first, String second) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    // throw new PendingException();
		hi = hello.sayHi (first, second);
	}

	@Then("^it should address both with \"([^\"]*)\"$")
	public void it_should_address_both_with(String expectedHi) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    // throw new PendingException();
		assertEquals(expectedHi, hi);
	}
	
	
}
