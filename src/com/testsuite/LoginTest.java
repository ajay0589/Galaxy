package com.testsuite;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {

	@Test(priority = 0, dataProvider = "testdata")
	void btest1(String user, String password) {
		System.out.println("First test");
		System.out.println(user);
		System.out.println(password);
	}

	/*
	 * @Test(priority = 1) void ctest2() { System.out.println("Second test"); }
	 * 
	 * @Test(priority = 2) void atest3() { System.out.println("Third test"); }
	 */

	@DataProvider(name = "testdata")
	Object[][] data() {
		Object[][] obj = { { "ajay", "automation" } }; // excel, json
		return obj;
	}

	/*
	 * @BeforeTest void beforeTest() { System.out.println("Before test"); }
	 */

}
