package cucumber.examles.java.helloworld;

import cucumber.api.junit.*;
import cucumber.api.*; 	
import org.junit.runner.*;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber"},
features="src/test/resources"
		)
public class RunCukesTest {
}
 
