package cucumber.examles.java.helloworld;

public class Hello {

	private String greeting;

	public Hello(String greeting) {
		this.greeting = greeting;
	}

	public String sayHi() {
		//return null;
		return greeting + " Globe!";
		
	}

	public String sayHiTo(String name) {
		// return null;
		return greeting + " " + name + "!";
	}

	public String sayHi(String first, String second) {
		// return null;
		return greeting + " " + first + " and " + second;
	}

}
