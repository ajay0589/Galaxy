package framework.testsuite;

import org.testng.annotations.Test;

import framework.pages.BasePage;
import framework.pages.LoginPage;

public class LoginTest {

	BasePage basePage;
	LoginPage loginPage;

	LoginTest() {
		basePage = new BasePage();
		loginPage = new LoginPage();
	}

	@Test
	void loginTest() {
		LoginTest loginTest = new LoginTest();
			
		loginPage.login();

	}

}
