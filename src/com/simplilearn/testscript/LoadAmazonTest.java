package com.simplilearn.testscript;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoadAmazonTest {
	WebDriver driver;
	
	@Before
	public void setUpDriver() {			
		// 1. set properties
		System.setProperty("webdriver.gecko.driver","/home/ubuntu/eclipse-workspace/SeleniumTestWd/driver/geckodriver");
				
		//2. instantiate web driver obj
		driver = new FirefoxDriver();
	}

	@Test
	public void verifyTitle() {
		final String siteUrl = "https://www.amazon.in/";	
		driver.get(siteUrl);
		
		String expectedTitle ="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle= driver.getTitle();		
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	@After
	public void closeDriver() {
		driver.close();
	}
}
