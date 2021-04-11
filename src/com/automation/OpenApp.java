package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenApp {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ajayj\\eclipse-workspace\\Galaxy\\BrowerDrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/newtours/");

		WebElement userNameTextbox = driver.findElement(By.xpath("//input[@name='userName']"));
		userNameTextbox.sendKeys("selenium1234");
		Thread.sleep(3000);

		WebElement passwordTextbox = driver.findElement(By.name("password"));
		passwordTextbox.sendKeys("selenium1234");
		Thread.sleep(3000);

		WebElement submitButton = driver.findElement(By.name("submit"));
		submitButton.click();
		Thread.sleep(2000);

		
		
		
		
		
		
		
		
		
		WebElement flightLink = driver.findElement(By.xpath("//a[text()='Flights']"));
		flightLink.click();
		Thread.sleep(2000);

		String tripType = "oneway"; // Round Trip / One Way oneway/roundtrip

		WebElement tripTypeButton = driver.findElement(By.xpath("//input[@value='" + tripType + "']"));
		tripTypeButton.click();
		Thread.sleep(2000);

		WebElement departingFrom = driver.findElement(By.name("fromPort"));
		Select select = new Select(departingFrom);
		
		select.selectByVisibleText("London");		
	}
}

