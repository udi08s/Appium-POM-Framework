/**
 * 
 */
package com.testingfoo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

/**
 * @author udayseshadri
 *
 */
public class SignUpPage extends BasePage {

	private By firstName = By.xpath("//android.widget.EditText[contains(@text, 'First Name')]");
	private By lastName = By.xpath("//android.widget.EditText[contains(@text, 'Last Name')]");
	private By email = By.xpath("//android.widget.EditText[contains(@text, 'Email')]");
	private By phoneNumber = By.xpath("//android.widget.EditText[contains(@text, 'Phone Number')]");
	private By password = By.xpath("//android.widget.EditText[contains(@text, 'Password')]");
	private By confirmPassword = By.xpath("//android.widget.EditText[contains(@text, 'Confirm Password')]");
	private By signUpBtn = By.xpath("//*[contains(@text, 'Sign-Up with Email')]");

	public SignUpPage(AndroidDriver<MobileElement> driver) {
		super(driver);
	}

	/**
	 * @return the firstName
	 */
	public MobileElement getFirstName() {
		return getElement(firstName);
	}

	/**
	 * @return the lastName
	 */
	public MobileElement getLastName() {
		return getElement(lastName);
	}

	/**
	 * @return the email
	 */
	public MobileElement getEmail() {
		return getElement(email);
	}

	/**
	 * @return the phoneNumber
	 */
	public MobileElement getPhoneNumber() {
		return getElement(phoneNumber);
	}

	/**
	 * @return the password
	 */
	public MobileElement getPassword() {
		return getElement(password);
	}

	/**
	 * @return the confirmPassword
	 */
	public MobileElement getConfirmPassword() {
		return getElement(confirmPassword);
	}

	/**
	 * @return the signUpBtn
	 */
	public MobileElement getSignUpBtn() {
		return getElement(signUpBtn);
	}

	public void enterFirstName(String firstName) {
		// TODO Auto-generated method stub
		getFirstName().sendKeys(firstName);

	}

	public void enterLastName(String lastName) {
		// TODO Auto-generated method stub
		getLastName().sendKeys(lastName);
	}

	public void enterEmailID(String emailID) {
		// TODO Auto-generated method stub
		getEmail().sendKeys(emailID);
	}

	public void enterPhoneNumber(String number) {
		// TODO Auto-generated method stub
		getPhoneNumber().sendKeys(number);
	}

	public void enterPassword(String password) {
		// TODO Auto-generated method stub
		getPassword().sendKeys(password);
	}

	public void enterConfirmPassword(String confirmPassword) {
		// TODO Auto-generated method stub
		getConfirmPassword().sendKeys(confirmPassword);
	}

	public void clickSignUpBtn() {

		// ScrollUp

		Dimension size = driver.manage().window().getSize();
		int startx = (int) (size.width * 0.5D);
		int starty = (int) (size.height * 0.20D);
		int endy = (int) (size.height * 0.02D);

		TouchAction<?> action = new TouchAction(driver);
		action.press(PointOption.point(startx, starty)).moveTo(PointOption.point(startx, endy)).release().perform();

		getSignUpBtn().click();
	}

}
