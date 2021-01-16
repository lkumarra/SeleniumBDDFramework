package demo.guru99.com.steps;

import demo.guru99.com.constants.Configurations;
import demo.guru99.com.pageobjects.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	@Before
	public void setUp() {
		BasePage.initialization(Configurations.browser);
	}

	@After
	public void tearDown(Scenario scenario) {
		BasePage.takeScreenshot(scenario);
		BasePage.tearDown();
	}

}
