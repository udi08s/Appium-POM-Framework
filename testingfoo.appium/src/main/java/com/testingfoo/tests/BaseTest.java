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
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.testingfoo.pages.BasePage;
import com.testingfoo.pages.Page;
import com.testingfoo.utils.ExtentManager;
import com.testingfoo.utils.ExtentTestNGIReporterListener;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author udayseshadri
 *
 */
@Listeners(com.testingfoo.utils.ExtentTestNGIReporterListener.class)
public class BaseTest {
	
	public AndroidDriver<MobileElement> driver;
	public Page page;
	private String hubUrl = "http://localhost:4444/wd/hub";
	private static ExtentReports extent;

	
	@BeforeSuite
	public void suiteSetup() {
		
	
	}
	
	
	@BeforeClass
	@Parameters({"platformName","deviceName","platformVersion","udid","systemPort"})
	public  void setUpTest(String platformName,String deviceName,String platformVersion,String udid,String systemPort) throws MalformedURLException {
		
		
		File file = new File(System.getProperty("user.dir")+"//src//main//resource//com.kfcaus.ordering_2019-06-23.apk");
		
		DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("platformName", platformName);
	    caps.setCapability("deviceName", deviceName);
	    caps.setCapability("platformVersion", platformVersion);
	    caps.setCapability("automationName", "UiAutomator2");
	    caps.setCapability("app", file.getAbsolutePath());
	    caps.setCapability("udid", udid);
	    caps.setCapability("systemPort", systemPort);
	    caps.setCapability("noReset", "true");
	    caps.setCapability("autoGrantPermissions", "true");
	    
	    
	    driver=new AndroidDriver<MobileElement>(new URL(hubUrl), caps);
	    
	    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
		page = new BasePage(driver);
		
	}
	
	@AfterClass
	public void tearDown() {
	        
	        driver.quit();
	}
	
	@AfterSuite
	public void tearDownAll() {
		
		
	}

	

}
