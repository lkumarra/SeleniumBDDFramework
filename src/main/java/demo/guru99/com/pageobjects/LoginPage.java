package demo.guru99.com.pageobjects;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import demo.guru99.com.utilities.Utilities;
import demo.guru99.com.webelements.LoginPageLocators;


public class LoginPage extends BasePage {

	public LoginPageLocators loginPageLocators;
	public Utilities util = new Utilities();

	public LoginPage() {
		this.loginPageLocators = new LoginPageLocators();
		AjaxElementLocatorFactory ajaxEle = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(ajaxEle, this.loginPageLocators);
	}

	/**
	 * Return the text of userId label on login page.
	 * 
	 * @return Text of UserId Label.
	 */
	public String getUserIdLableText() {
		return util.getWebelementText(this.loginPageLocators.getUserIdLabelElement());
	}

	/**
	 * Return the text of password label on login page.
	 * 
	 * @return Text of Password Label.
	 */
	public String getPasswordLabelText() {
		return util.getWebelementText(this.loginPageLocators.getPasswordLabelElement());
	}

	/**
	 * Enter userId into userId input box.
	 * 
	 * @param userId : UserId to enter .
	 */
	public void enterUserId(String userId) {
		util.enterTextIntoTextBox(this.loginPageLocators.getUserIdInputBoxElement(), userId, true);
	}

	/**
	 * Enter password into password input box.
	 * 
	 * @param password : Password to enter.
	 */
	public void enterPassword(String password) {
		util.enterTextIntoTextBox(this.loginPageLocators.getPasswordInputBoxElement(), password, true);
	}

	/**
	 * Perform click operation on login button
	 */
	public void clickOnLoginButton() {
		util.clickOnElement(this.loginPageLocators.getLoginButtonElement());
	}

	/**
	 * Perform click operation on reset button.
	 */
	public void clickOnResetButton() {
		util.clickOnElement(this.loginPageLocators.getResetButtonElement());
	}

	/**
	 * Return the text of javascript alert without entering userId and password.
	 * 
	 * @return Javascript alert text.
	 */
	public String getAlertTextWithoutUserIdandPassword() {
		return util.getJavascriptAlertText();
	}

	/**
	 * Perform login by entering userId and password.
	 * 
	 * @param userId   : UserId to enter.
	 * @param password : Password to enter.
	 * @return Object of HomePage.
	 */
	public HomePage login(String userId, String password) {
		this.enterUserId(userId);
		this.enterPassword(password);
		this.clickOnLoginButton();
		return new HomePage();
	}
}
