package framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

	public LoginPage() {
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(xpath = "//input[@name='userName']")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(name = "submit")
	private WebElement submit;

	public void login() {

		appDriver.enterText(username, "selenium1234");
		appDriver.enterText(password, "selenium1234");
		appDriver.clickButton(submit);

	}

}
