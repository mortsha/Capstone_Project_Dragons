package tek.capstone.dragons.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "@Account",
		features = ("classpath:features"),
		glue = "tek.capstone.dragons",
		dryRun = false,
		// true : the steps will not execute and check we have our steps or not
		// false : the steps will execute
		plugin = {
				"pretty", 
				"html:target/htmlReports/capstone-pretty.html",
				"json:target/jsonReports/capstone.json"
		},
		snippets = CAMELCASE,
		monochrome = true
		)


public class TestRunner {

}
