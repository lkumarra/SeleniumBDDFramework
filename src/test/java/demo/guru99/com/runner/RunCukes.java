package demo.guru99.com.runner;

import org.testng.annotations.Test;

import courgette.api.CourgetteOptions;
import courgette.api.CourgetteRunLevel;
import courgette.api.CucumberOptions;
import courgette.api.testng.TestNGCourgette;

@Test
@CourgetteOptions(plugin = { "extentreports" }, threads = 1, runLevel = CourgetteRunLevel.SCENARIO, showTestOutput = true, reportTargetDir = "src/test/resources/testreports",reportTitle = "guru99bankreport.html", cucumberOptions = @CucumberOptions(features = {
				"src/test/resources/features" }, glue = "demo\\guru99\\com\\steps", plugin = { "pretty",
						"json:src/test/resources/testreports/cucumber_report/guru99bank.json",
						"html:src/test/resources/testreports/cucumber_report/guru99bank" }, monochrome = true, strict = true))
public class RunCukes extends TestNGCourgette {

}
