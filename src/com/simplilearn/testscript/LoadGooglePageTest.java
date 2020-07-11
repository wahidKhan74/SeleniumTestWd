package com.simplilearn.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoadGooglePageTest {

	public static void main(String[] args) {
		//declaration and instantiation of driver object
		// 1. set properties
		System.setProperty("webdriver.gecko.driver","/home/ubuntu/eclipse-workspace/SeleniumTestWd/driver/geckodriver");
		
		//2. instantiate web driver obj
		WebDriver driver = new FirefoxDriver();
		
//		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		String fetchedTitle =  driver.getTitle();
		String expectedTitle = "Google";
		
		if(fetchedTitle.equals(expectedTitle)) {
			System.out.println("Test Passed !");
		}else {
			System.out.println("Test Failed !");
		}
		
		driver.close();
		
		
	}
	
	

}
