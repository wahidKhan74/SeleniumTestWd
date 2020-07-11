package com.simplilearn.testscript;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	
	@Ignore
	@Test
	public void verifyTitle() {
		final String siteUrl = "https://www.amazon.in/";	
		driver.get(siteUrl);
		
		String expectedTitle ="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle= driver.getTitle();		
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	@Ignore
	@Test
	public void verifySource() {
		final String siteUrl = "https://www.amazon.in/";	
		driver.get(siteUrl);
		String actualUrl = driver.getCurrentUrl();
			
		Assert.assertEquals(siteUrl, actualUrl);
	}
	
	@Ignore
	@Test
	public void findInputsSource() {
		final String siteUrl = "https://www.amazon.in/";	
		driver.get(siteUrl);
		String actualUrl = driver.getCurrentUrl();
		System.out.println("------------------------");
		List<WebElement> allInputs = driver.findElements(By.tagName("input"));
		for(WebElement oneInput : allInputs) {
			System.out.println(oneInput.getAttribute("value"));
		}
		
	}
	
	@Test
	public void gotMobilesPage() {
		final String siteUrl = "https://www.amazon.in/";	
		driver.get(siteUrl);
		// 1. find Web Element
		WebElement mobileLink = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]"));
		
		// 2. submit action
		mobileLink.click();
		
		WebElement inputCheck = driver.findElement(By.cssSelector("ul.a-unordered-list:nth-child(8) > div:nth-child(1) > li:nth-child(1) > span:nth-child(1) > span:nth-child(1) > div:nth-child(1) > label:nth-child(1) > input:nth-child(1)"));
		inputCheck.click();
		
	}
	
	@Ignore
	@Test
	public void searchForIphone() throws InterruptedException {
		final String siteUrl = "https://www.amazon.in/";	
		driver.get(siteUrl);
		
		//find search field
		WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
		// add value
		searchField.sendKeys("Iphone 11 max pro");
		Thread.sleep(2000);
		
		WebElement submit = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input"));
		
		submit.click();
		Thread.sleep(20000);
		
	}
	@After
	public void closeDriver() {
		driver.close();
	}
}
