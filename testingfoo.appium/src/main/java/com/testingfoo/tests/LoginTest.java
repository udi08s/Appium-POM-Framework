/**
 * 
 */
package com.testingfoo.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.testingfoo.pages.HomePage;
import com.testingfoo.pages.LoginPage;
import com.testingfoo.pages.MenuPage;
import com.testingfoo.pages.SignUpLoginPage;

/**
 * @author udayseshadri
 *
 */
public class LoginTest extends BaseTest{
	
	@Test
	public void test() {
		
		HomePage homePage=page.getInstance(HomePage.class);
		MenuPage menuPage=homePage.clickMenu();
		SignUpLoginPage signUpLoginPage=menuPage.clickSignUpLogin();
		LoginPage loginPage=signUpLoginPage.clickLogin();
		loginPage.enterEmailID("testuday@maildrop.cc");
		loginPage.enterPassword("pass1234");
		homePage=loginPage.clickLogin();
		Assert.assertTrue(driver.findElement(By.id("com.kfcaus.ordering:id/icon_button_container_ll")).isDisplayed(), "Order Now Button is not displayed");
	}
}
