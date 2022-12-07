package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = "stepDefinitions", tags = "@Mytag or @Mytag2",
                plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"})
public class TestRunner {
 // this class is not needed for IntellijIdea, unless U want to run tests via JUnit, otherwise click on features and run the test

}