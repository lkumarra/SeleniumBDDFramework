package demo.guru99.com.pageobjects;

import java.util.List;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import demo.guru99.com.utilities.Utilities;
import demo.guru99.com.webelements.HomePageLocators;


public class HomePage extends BasePage {

	public HomePageLocators homePageLocators;
	Utilities utilities = new Utilities();

	public HomePage() {
		homePageLocators = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(factory, homePageLocators);
	}

	/**
	 * Return the text of welcome message on home page.
	 * 
	 * @return Text of welcome message.
	 */
	public String getWelcomeMessage() {
		return utilities.getWebelementText(homePageLocators.getWelcomMessageLocator());
	}

	/**
	 * Return the text of managerId message.
	 * 
	 * @return ManagerId Message.
	 */
	public String getManageIdMessage() {
		return utilities.getWebelementText(homePageLocators.getManagerIdLocator());
	}

	/**
	 * Return the text of links on Home Page.
	 * 
	 * @return Text of Links.
	 */
	public List<String> getLinkTexts() {
		return utilities.getWebelementsTexts(homePageLocators.getMenuElements());
	}

	/**
	 * Click on new customer link.
	 * 
	 * @return Object of new customer page.
	 */
	public NewCustomerPage clickOnNewCustomerLink() {
		utilities.clickOnElement(homePageLocators.getNewCustomerElement());
		return new NewCustomerPage();
	}

}
