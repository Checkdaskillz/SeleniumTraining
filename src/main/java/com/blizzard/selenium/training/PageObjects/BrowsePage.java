package com.blizzard.selenium.training.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



/**
 *
 * Summary: Using this type of java class is very useful to breakdown clutter in code.
 *          Within this java class, only objects are held here. In Selenium's case, it will
 *          hold temporary values for elements which will be used by another class. This makes
 *          it possible for the objects to be reused multiple times from other classes.
 *          Less rewriting the code, the better.
 */

public class BrowsePage {
	@FindBy(css="ul.product-card-container.thumbnails li:nth-child(1) a")
	private WebElement wodlink;
	
	public WebElement getwodlink() {
		return wodlink;
		
	}
	
}
