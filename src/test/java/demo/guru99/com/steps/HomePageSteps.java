package demo.guru99.com.steps;

import java.util.List;

import org.testng.Assert;

import demo.guru99.com.pageobjects.BasePage;
import demo.guru99.com.pageobjects.HomePage;
import demo.guru99.com.pageobjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
	
	public LoginPage loginPage = new LoginPage();
	public HomePage homePage;
	
	
	@Given("I navigate to url {string}")
	public void i_navigate_to_url(String url) {
	    BasePage.getUrl(url);
	}

	@When("I enter userID as {string} and password as {string}")
	public void i_enter_userID_as_and_password_as(String userId, String password) {
		homePage = loginPage.login(userId, password);
	}

	@Then("A welcome message {string} should present.")
	public void a_welcome_message_should_present(String welcomeMessage) {
		Assert.assertEquals(homePage.getWelcomeMessage(), welcomeMessage);
	}

	@Then("user userID with message {string} should present.")
	public void user_userID_with_message_should_present(String userIdMessage) {
		Assert.assertEquals(homePage.getManageIdMessage(), userIdMessage);
	}

	@Then("I get all the Links")
	public void i_get_all_the_Links(List<String> list) {
	    List<String> actualLinks = homePage.getLinkTexts();
	    for(int i =0; i<actualLinks.size(); i++) {
	    	Assert.assertEquals(actualLinks.get(i), list.get(i+1));
	    }
	}


}
