package demo.guru99.com.utilities;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import demo.guru99.com.pageobjects.BasePage;

public class Utilities extends BasePage {

	/**
	 * Return the instanse of the WebdriverWait
	 * 
	 * @return
	 */
	private synchronized WebDriverWait getWebdiverWaitInstance() {
		WebDriverWait driverWait = new WebDriverWait(driver, 30);
		return driverWait;
	}

	/**
	 * Wait for maxixmum 30 second until a webelement in clickable state.
	 * 
	 * @param element : Webelement for wait.
	 */
	public synchronized void elementToBeClickableWait(WebElement element) {
		getWebdiverWaitInstance().until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * Wait for alert to be present.
	 */
	public synchronized void alertToBePresentWait() {
		getWebdiverWaitInstance().until(ExpectedConditions.alertIsPresent());
	}

	/**
	 * Wait for maximux 30 second for the visisblity of webelement.
	 * 
	 * @param element : Webelement for wait.
	 */
	public synchronized void elementToBeVisisbleWait(WebElement element) {
		getWebdiverWaitInstance().until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * Return Webelement using by.
	 * 
	 * @param by
	 * @return Webelement
	 */
	private WebElement getWebElement(By by) {
		return driver.findElement(by);
	}

	/**
	 * Return list of webelements using by.
	 * 
	 * @param by
	 * @return List of Webelements.
	 */
	private List<WebElement> getWebElementList(By by) {
		return driver.findElements(by);
	}

	/**
	 * Perform click operation on webelement.
	 * 
	 * @param element: Webelement to perform operation.
	 */
	public synchronized void clickOnElement(WebElement element) {
		elementToBeClickableWait(element);
		element.click();
	}

	/**
	 * Perform click operation using By.
	 * 
	 * @param by
	 */
	public synchronized void clickOnElement(By by) {
		WebElement element = getWebElement(by);
		clickOnElement(element);
	}

	/**
	 * Perform click operation on webelement using js executor.
	 * 
	 * @param element: Webelement to perform click operation.
	 */
	public synchronized void clickUsingJs(WebElement element) {
		this.elementToBeVisisbleWait(element);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}

	/**
	 * Perform click operation using By.
	 * 
	 * @param by
	 */
	public synchronized void clickUsingJs(By by) {
		WebElement element = getWebElement(by);
		clickOnElement(element);
	}

	/**
	 * Enter text into weblement without.
	 * 
	 * @param element      : Webelement to enter text.
	 * @param textToEnter  : Text to enter in webelement.
	 * @param isAfterClear : True if clear operation has to be performed before text
	 *                     enter else false.
	 */
	public synchronized void enterTextIntoTextBox(WebElement element, String textToEnter, boolean isAfterClear) {
		elementToBeVisisbleWait(element);
		if (isAfterClear) {
			element.clear();
			element.sendKeys(textToEnter);
		} else {
			element.sendKeys(textToEnter);
		}
	}

	/**
	 * Enter text into webelement.
	 * 
	 * @param by           : By Locator.
	 * @param textToEnter  : Text to enter in webelement.
	 * @param isAfterClear : True if clear operation has to be performed before text
	 *                     enter else false
	 */
	public synchronized void enterTextIntoTextBox(By by, String textToEnter, boolean isAfterClear) {
		WebElement element = getWebElement(by);
		enterTextIntoTextBox(element, textToEnter, isAfterClear);
	}

	/**
	 * Perform clear operation on the webelement
	 * 
	 * @param element : Webelement to perform clear operation
	 */
	public synchronized void clearText(WebElement element) {
		elementToBeVisisbleWait(element);
		element.clear();
	}

	/**
	 * Perform clear operation on webelement using By Locator.
	 * 
	 * @param by By Locator.
	 */
	public synchronized void clearText(By by) {
		WebElement element = getWebElement(by);
		clearText(element);
	}

	/**
	 * Return the text of webelement.
	 * 
	 * @param element : Webelement to get text.
	 * @return Text of webelement.
	 */
	public synchronized String getWebelementText(WebElement element) {
		elementToBeVisisbleWait(element);
		return element.getText();
	}

	/**
	 * Return the text of webelement.
	 * 
	 * @param by : By Locator.
	 * @return Text of webelement
	 */
	public synchronized String getWebelementText(By by) {
		WebElement element = getWebElement(by);
		return getWebelementText(element);
	}

	/**
	 * Return the list of text of webelements.
	 * 
	 * @param webelementList : List of webelemets.
	 * @return List of text of webelements.
	 */
	public synchronized List<String> getWebelementsTexts(List<WebElement> webelementList) {
		List<String> textList = new ArrayList<String>();
		for (int iterator = 0; iterator < webelementList.size(); iterator++) {
			this.elementToBeVisisbleWait(webelementList.get(iterator));
			textList.add(webelementList.get(iterator).getText());
		}
		return textList;
	}

	/**
	 * Return the list of webelements.
	 * 
	 * @param by : By Locator
	 * @return List of text of webelements.
	 */
	public synchronized List<String> getWebelementsTexts(By by) {
		List<WebElement> WebelementList = getWebElementList(by);
		return getWebelementsTexts(WebelementList);
	}

	/**
	 * Return the value of attribute
	 * 
	 * @param element   : Webelement to get attribute.
	 * @param attribute : Name of the attribute.
	 * @return attribute value.
	 */
	public synchronized String getArributeValue(WebElement element, String attribute) {
		elementToBeVisisbleWait(element);
		return element.getAttribute(attribute);
	}

	/**
	 * Return the css property value.
	 * 
	 * @param element      : Webelement to get css property.
	 * @param cssAttribute : property of CSS attribute.
	 * @return Css Property value.
	 */
	public synchronized String getCssValue(WebElement element, String cssAttribute) {
		elementToBeVisisbleWait(element);
		return element.getCssValue(cssAttribute);
	}

	/**
	 * Check webelement is enable or not.
	 * 
	 * @param element Webelement to check
	 * @return True if enable false otherwise.
	 */
	public synchronized boolean isEnabled(WebElement element) {
		elementToBeVisisbleWait(element);
		return element.isEnabled();
	}

	/**
	 * Return the instance of select class.
	 * 
	 * @param element : Webelement to perform select operation.
	 * @return instanse of select class.
	 */
	private synchronized Select getSelectInstance(WebElement element) {
		elementToBeVisisbleWait(element);
		return new Select(element);
	}

	/**
	 * Select a webelement using value.
	 * 
	 * @param element : Webelement to perform select operation.
	 * @param value   : Value to select
	 */
	public synchronized void selectElementByValue(WebElement element, String value) {
		getSelectInstance(element).selectByValue(value);
	}

	/**
	 * Select a webelement using text.
	 * 
	 * @param element : Webelement to perform select operation.
	 * @param text    : text to select
	 */
	public synchronized void selectElementByText(WebElement element, String text) {
		getSelectInstance(element).selectByVisibleText(text);
	}

	/**
	 * Select a webelement using index.
	 * 
	 * @param element : Webelement to perform select operation.
	 * @param index   : index to select.
	 */
	public synchronized void selectElementByIndex(WebElement element, int index) {
		getSelectInstance(element).selectByIndex(index);
	}

	/**
	 * Return the instance of action class.
	 * 
	 * @return instance of action class.
	 */
	private synchronized Actions getActionInstance() {
		return new Actions(driver);
	}

	/**
	 * Perform right click operation on the webelement.
	 * 
	 * @param element : Webelement to perform right click operation.
	 */
	public synchronized void performRightClickOperaion(WebElement element) {
		getActionInstance().contextClick(element).build().perform();
	}

	/**
	 * Perform mouse move action on the webelement.
	 * 
	 * @param element : Webelemet for perform mouse move operation
	 */
	public synchronized void mouseMoveToWebelement(WebElement element) {
		getActionInstance().moveToElement(element).build().perform();
	}

	/**
	 * Get the Javascript alert text and accept the alert.
	 * 
	 * @return Text of javascript.
	 */
	public synchronized String getJavascriptAlertText() {
		System.out.println("Inside alert method");
		this.alertToBePresentWait();
		String alertText = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return alertText;
	}

}
