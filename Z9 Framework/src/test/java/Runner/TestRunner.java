package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\FeatureFiles\\MovieReleaseDateMatchingTest.feature", glue = {
		"Stepdefinations" }, dryRun = false, monochrome = true, plugin = {"pretty","json:target/cucumber.json", "html:target/cucumber.html" })
public class TestRunner {

}
