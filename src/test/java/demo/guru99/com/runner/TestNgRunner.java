package demo.guru99.com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features/LoginPage.feature"} , plugin = {"json:target/cucumber.json","html:target/site/cucumber-pretty"},
glue = "demp\\guru99\\com\\steps")
public class TestNgRunner extends AbstractTestNGCucumberTests{

}
