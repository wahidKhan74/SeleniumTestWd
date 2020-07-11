package com.simplilearn.testscript;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoadAmazonHomeTest {

	@Test
	public void testHompage(){
		
		final String siteUrl = "https://www.amazon.in/";
		
		// 1. set properties
		System.setProperty("webdriver.gecko.driver","/home/ubuntu/eclipse-workspace/SeleniumTestWd/driver/geckodriver");
				
		//2. instantiate web driver obj
		WebDriver driver = new FirefoxDriver();
		 
		driver.get(siteUrl);
		
		String expectedTitle ="Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle= driver.getTitle();
		
		Assert.assertEquals(expectedTitle, actualTitle);
		
	}
}
