package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		         features = "FeatureFiles",
		         glue = {"stepDefinations","hooks"},
		         plugin = {"pretty", "html:target/cucumber.html","summary","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		         snippets = SnippetType.CAMELCASE,
		         dryRun = false,
		         tags = "@tag1"
		         		         
		         )
public class TestRunner {

}
