package com.sqa.MA.Gmailtest;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Gmailtest2 {
	private boolean acceptNextAlert = true;
	private String baseUrl;
	private WebDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		this.driver = new FirefoxDriver();
		this.baseUrl = "https://www.google.com/";
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		this.driver.quit();
		String verificationErrorString = this.verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	@Test
	public void testGmailtest2() throws Exception {
		this.driver.get(this.baseUrl + "/?gfe_rd=ssl&ei=BUkYV5XHH-aD8Qf25KCIDA");
		this.driver.findElement(By.id("gb_70")).click();
		this.driver.findElement(By.id("Email")).clear();
		this.driver.findElement(By.id("Email")).sendKeys("mikiastest1@gmail.com");
		this.driver.findElement(By.id("next")).click();
		this.driver.findElement(By.id("Passwd")).clear();
		this.driver.findElement(By.id("Passwd")).sendKeys("gunittest1");
		this.driver.findElement(By.id("signIn")).click();
		this.driver.findElement(By.linkText("Gmail")).click();
		this.driver.findElement(By.cssSelector("span.gb_2a.gbii")).click();
		this.driver.findElement(By.id("gb_71")).click();
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = this.driver.switchTo().alert();
			String alertText = alert.getText();
			if (this.acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			this.acceptNextAlert = true;
		}
	}

	private boolean isAlertPresent() {
		try {
			this.driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private boolean isElementPresent(By by) {
		try {
			this.driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}
