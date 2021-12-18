package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/features"}, 
		glue={"stepDefinitions"},
		stepNotifications = true,
		tags = ("@edge"),
		plugin = {"pretty", "html:target/cucumber.html"} ) 

public class TestRunner {

}
