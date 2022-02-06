package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/features/login.feature" ,"src/test/java/features/navigation.feature", "src/test/java/features/usercreation.feature" }, 
		glue={"stepDefinitions"},
		stepNotifications = true,
		tags = ("@test"),
		plugin = {"pretty", "html:target/cucumber.html", "junit:target/cukes.xml", "junit:target/cukes.json"} ) 

public class TestRunner {

}
