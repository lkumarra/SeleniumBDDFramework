package demo.guru99.com.steps;

import org.testng.Assert;

import demo.guru99.com.pageobjects.BasePage;
import demo.guru99.com.pageobjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	
	LoginPage page = new LoginPage();
	
	@Given("As a user i navigate to url {string}")
	public void as_a_user_i_navigate_to_url(String url) {
		BasePage.getUrl(url);
	}

	@Then("UserId label is {string}")
	public void userid_label_is(String userIdLabel) {
		Assert.assertEquals(page.getUserIdLableText(), userIdLabel);
	}

	@Then("Password Label is {string}")
	public void password_Label_is(String passwordLabel) {
		Assert.assertEquals(page.getPasswordLabelText(), passwordLabel);;
	}

	@When("I enter userId as {string} and password {string}")
	public void i_enter_userId_as_and_password(String userId, String password) {
		page.login(userId, password);
	}

	@Then("I get a alert with text {string}")
	public void i_get_a_alert_with_text(String alertText) {
		Assert.assertEquals(page.getAlertTextWithoutUserIdandPassword(), alertText);
	}
}
