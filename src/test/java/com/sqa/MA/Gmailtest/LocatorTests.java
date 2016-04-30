/**
 *   File Name: LocatorTests.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 21, 2016
 *
 */

package com.sqa.MA.Gmailtest;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sqa.MA.util.helpers.Locator;

/**
 * LocatorTests //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class LocatorTests {

	static WebDriver driver;

	@BeforeClass
	public static void setupFirefox() throws InterruptedException {

	}

	@Test(priority = 1)
	public void test1() {
		String pageTile = "MSN.com - Hotmail, Outlook, Skype, Bing, Latest News, Photos & Videos";
		driver = new FirefoxDriver();
		driver.get("http://msn.com");
		Assert.assertEquals(driver.getTitle(), pageTile, "Page load does not seem successful.");

	}

	@Test(priority = 2)
	public void test2() {
		List<WebElement> links = Locator.getLinks(this.driver);
		int i = 1;
		for (WebElement link : links) {
			String text = link.getText();
			if (text.equals("")) {
				text = "Non text (" + i + " )";
				i++;
			}
			System.out.println(link.getText() + " - " + link.getAttribute("href"));
		}
	}
}
