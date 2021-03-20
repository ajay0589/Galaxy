package com.automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ajayj\\eclipse-workspace\\Galaxy\\BrowerDrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.xpath("//button[text()='Click me' and @id='alertButton']")).click();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();

		
		
	}

}
