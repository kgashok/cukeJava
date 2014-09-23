package cucumber.examles.java.helloworld;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber"},
features="src/test/resources"
		)
public class RunCukesTest {
}
 
