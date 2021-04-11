package framework.pages;

import org.openqa.selenium.WebDriver;

import framework.utilities.WrapperDriver;

public class BasePage {

	WrapperDriver appDriver;
	WebDriver webDriver;

	public BasePage() {
		webDriver = appDriver.openBrowser("chrome");
	}

}
