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

public class HomePage {
    /**First create an object to retrieve the data you want**/
    //@FindBy(element locator)
    //private Type-of-Object name-for-the-object;
	
	@FindBy(css="ul.game-types.nav.nav-list li:nth-child(1) a")
	private WebElement linkWarcraft;
	

    /**Once locator object is created, create a getter and setter.
       Getter and Setters are where the object gets the data and where it can be assigned to.
    **/
	
	public WebElement getLinkWarcraft() {
		return linkWarcraft;
		
	}

}
