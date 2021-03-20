package com.automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ajayj\\eclipse-workspace\\Galaxy\\BrowerDrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/alertsWindows");
		
		driver.findElement(By.xpath("//span[text()='Browser Windows']")).click();
		
		String currentPageId = driver.getWindowHandle();
		System.out.println(currentPageId);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='New Tab']")).click();
				
    	Set<String> allWindows = driver.getWindowHandles();
    	
    	for (String string : allWindows) {
    		driver.switchTo().window(string);
    		
    		String newWindow = driver.getWindowHandle();
    	   		
    		if(!newWindow.equalsIgnoreCase(currentPageId)) {
    			break;
    		}    		
		}
		
    	String currentPageId1 = driver.getWindowHandle();
		System.out.println(currentPageId1);
		
		
		
		

	}

}
