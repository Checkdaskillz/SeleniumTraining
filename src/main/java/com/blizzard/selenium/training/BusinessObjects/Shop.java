package com.blizzard.selenium.training.BusinessObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.blizzard.selenium.training.PageObjects.BrowsePage;
import com.blizzard.selenium.training.PageObjects.HomePage;
import com.blizzard.selenium.training.PageObjects.ProductDetailsPage;

/**
 *
 * Summary: Business objects is a java classes where methods / functions are
 * stored. These objects will then be later called by the main test object to be
 * executed. Business objects will be calling upon the page objects for
 * retrieving the data.
 *
 * Note: Make sure each method/function created does exactly what it is named.
 * When your method/function begins to go on a tangent, it is best to create a
 * new method/function for that operation.
 */
public class Shop {
	private final HomePage homePage;
	private final BrowsePage browsePage;
	private final WebDriver driver;
	private final ProductDetailsPage productDetailsPage;

	// Constructor for SandBoxTest
	public Shop(final WebDriver driver) {
		this.driver = driver;
		homePage = new HomePage();
		browsePage = new BrowsePage();
		productDetailsPage = new ProductDetailsPage();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageFactory.initElements(driver, homePage);
		PageFactory.initElements(driver, browsePage);
		PageFactory.initElements(driver, productDetailsPage);
	}

	public boolean verifyStandardPrice() {

		// Navigate to shop home page.
		String home = "http://us.battle.net/shop";
		driver.get(home);

		// Click the World of Warcraft Link.
		homePage.getLinkWarcraft().click();

		// Locate the Draenor card and click it.
		browsePage.getwodlink().click();

		// Locate the standard edition price and verify it displays 49.99.
		String price = productDetailsPage.getstandardPrice().getText();

		// Test case pass/fail
		if (price.equals("USD 49.99")) {
			return true;
		} else {
			return false;

		}

	}

	// Such examples of methods/functions to be used below in this class.

	// Method navigates to shop homepage.

	// Method navigates to shop homepage and clicks on WoW product family using
	// page objects.

	// Method retrieves product card name and price from page objects.

	// Method navigates to shop homepage, clicks on SC2 product family, then
	// clicks Shop Home icon.
}
