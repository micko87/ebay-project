package com.sqa.MA.Gmailtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicAutoTest {

	static WebDriver driver;

	@DataProvider(name = "UserAccountInfo")
	public static Object[][] getData() {
		Object[][] data = { { "mikiastest1@gmail.com", "gunittest1" }, { "mikiastest2@gmail.com", "gunittest2" },
				{ "mikiastest3@gmail.com", "gunittest3" } };
		return data;
	}

	@BeforeClass(enabled = true, groups = "chrome")
	public static void setupChrome() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://gmail.com");
		Thread.sleep(1000);

	}

	@BeforeClass(enabled = false, groups = "firefox")
	public static void setupFirefox() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		Thread.sleep(1000);

	}

	@BeforeClass(enabled = false, groups = "safari")
	public static void setupSafari() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		Thread.sleep(1000);

	}

	@Test(dataProvider = "UserAccountInfo")
	public void test(String username, String password) throws InterruptedException {
		System.out.println("Basic Test: U-" + username + "/P-" + password);

	}
}