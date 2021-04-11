package framework.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WrapperDriver {

	static WebDriver driver;

	public static WebDriver openBrowser(String browser) {

		if (driver == null) {
			switch (browser) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\ajayj\\eclipse-workspace\\Galaxy\\BrowerDrivers\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://demo.guru99.com/test/newtours/");
				break;
			case "firefox":
				break;
			case "ie":
				break;
			default:
				System.out.println("Wrong browser");
				break;
			}	
		}
		return driver;
	}

	public static void waitForElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void enterText(WebElement element, String text) {
		waitForElement(element);
		element.sendKeys(text);
	}

	public static void clickButton(WebElement element) {
		waitForElement(element);
		element.click();
	}

}
