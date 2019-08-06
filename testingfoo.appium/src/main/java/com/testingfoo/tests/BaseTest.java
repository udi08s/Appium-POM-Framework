/**
 * 
 */
package com.testingfoo.tests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.testingfoo.pages.BasePage;
import com.testingfoo.pages.Page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author udayseshadri
 *
 */
public class BaseTest {
	
	AndroidDriver<MobileElement> driver;
	public Page page;
	
	@BeforeMethod
	//@Parameters(value= {"browser"})
	public void setUpTest() throws MalformedURLException {
		
		File file = new File(System.getProperty("user.dir")+"//src//main//resource//com.kfcaus.ordering_2019-06-23.apk");
		
		DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("platformName", "Android");
	    caps.setCapability("deviceName", "dfa3b957");
	    caps.setCapability("platformVersion", "9");
	    caps.setCapability("automationName", "UiAutomator2");
	    caps.setCapability("app", file.getAbsolutePath());
	    caps.setCapability("noReset", "true");
	    caps.setCapability("autoGrantPermissions", "true");
	    
	    
	    driver=new AndroidDriver<MobileElement>(new URL("http:/0.0.0.0:4723/wd/hub"), caps);
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
		page = new BasePage(driver);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
