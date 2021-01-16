package demo.guru99.com.steps;

import org.junit.Assert;

import demo.guru99.com.pageobjects.BasePage;
import demo.guru99.com.pageobjects.HomePage;
import demo.guru99.com.pageobjects.LoginPage;
import demo.guru99.com.pageobjects.NewCustomerPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewCustomerPageSteps {

	public LoginPage loginPage = new LoginPage();
	public HomePage homePage;
	public NewCustomerPage newCustomerPage;

	@Given("I navigate to url {string} to test New Customer feature")
	public void i_navigate_to_url_to_test_New_Customer_feature(String url) {
		BasePage.getUrl(url);
	}

	@When("I enter userID as {string} and password as {string} to login sucessfully")
	public void i_enter_userID_as_and_password_as_to_login_sucessfully(String userId, String password) {
		homePage = loginPage.login(userId, password);
	}

	@Then("I clicked on New Customer Link.")
	public void i_clicked_on_New_Customer_Link() {
	  newCustomerPage = homePage.clickOnNewCustomerLink();
	}
	
	@Then("heading {string} should be present.")
	public void heading_should_be_present(String addNewCustomerHeading) {
		Assert.assertEquals(newCustomerPage.getAddNewCustomerLabelText(), addNewCustomerHeading);
	}

	@Then("label customer name with text {string} should be present")
	public void label_customer_name_with_text_should_be_present(String customerNameLabel) {
		Assert.assertEquals(newCustomerPage.getCustomerNameLabelText(), customerNameLabel);
	}

	@Then("label gender with text {string} should be present.")
	public void label_gender_with_text_should_be_present(String genderLabel) {
		Assert.assertEquals(newCustomerPage.getGenderLabelText(), genderLabel);
	}

	@Then("label Date of Birth with text {string} should be present.")
	public void label_Date_of_Birth_with_text_should_be_present(String dobLabel) {
		Assert.assertEquals(newCustomerPage.getDobLabelText(), dobLabel);
	}

	@Then("label Address with text {string} should be present.")
	public void label_Address_with_text_should_be_present(String addressLabel) {
		Assert.assertEquals(newCustomerPage.getAddressLabelText(), addressLabel);
	}

	@Then("label City with text {string} should be present.")
	public void label_City_with_text_should_be_present(String cityLabel) {
		Assert.assertEquals(newCustomerPage.getCityLabelText(), cityLabel);
	}

	@Then("label State with text {string} should be present.")
	public void label_State_with_text_should_be_present(String stateLabelText) {
		Assert.assertEquals(newCustomerPage.getStateLabelText(), stateLabelText);
	}

	@Then("label PIN with text {string} should be present.")
	public void label_PIN_with_text_should_be_present(String pinLabelText) {
		Assert.assertEquals(newCustomerPage.getPinLabelText(), pinLabelText);
	}

	@Then("label Mobile Number with test {string} should be present.")
	public void label_Mobile_Number_with_test_should_be_present(String mobileNumberLabel) {
		Assert.assertEquals(newCustomerPage.getMobileNumberLabelText(), mobileNumberLabel);
	}

	@Then("label E-Mail with text {string} should be present.")
	public void label_E_Mail_with_text_should_be_present(String emailLabelText) {
		Assert.assertEquals(newCustomerPage.getEmailLabelText(), emailLabelText);
	}

	@Then("label Password with text {string} should be present.")
	public void label_Password_with_text_should_be_present(String passwordLabelText) {
		Assert.assertEquals(newCustomerPage.getPasswordLabelText(), passwordLabelText);
	}

}
