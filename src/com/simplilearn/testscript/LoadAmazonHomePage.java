package com.simplilearn.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoadAmazonHomePage {

	public static void main(String[] args) {
		
		final String siteUrl = "https://www.amazon.in/";
		
		// 1. set properties
		System.setProperty("webdriver.gecko.driver","/home/ubuntu/eclipse-workspace/SeleniumTestWd/driver/geckodriver");
				
		//2. instantiate web driver obj
		WebDriver driver = new FirefoxDriver();
		String expectedTitle ="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"; 
		driver.get(siteUrl);
		
		if(driver.getTitle().equals(expectedTitle)) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		
		driver.close();
		

	}

}
