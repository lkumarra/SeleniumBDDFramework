package demo.guru99.com.runner;

import org.testng.annotations.Test;

import courgette.api.CourgetteOptions;
import courgette.api.CourgetteRunLevel;
import courgette.api.CucumberOptions;
import courgette.api.testng.TestNGCourgette;

@Test
@CourgetteOptions(
		plugin = {"extentreports"},
        threads = 1,
        runLevel = CourgetteRunLevel.SCENARIO,
        showTestOutput = true,
        reportTargetDir = "build",
        cucumberOptions = @CucumberOptions(
                features = {"src/test/resources/features/LoginPage.feature"},
                glue ="demo\\guru99\\com\\steps",
                plugin = {
                        "pretty",
                        "json:build/cucumber-report/cucumber.json",
                        "html:build/cucumber-report/cucumber.html"},
				monochrome = true,
				strict = true
        ))
public class RunCukes extends TestNGCourgette{

}
