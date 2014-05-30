package com.blizzard.selenium.training;



import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.blizzard.selenium.training.BusinessObjects.Shop;

public class TestOne {
	WebDriver driver = new FirefoxDriver();
	Shop shop = new Shop(driver);
	
    

    @Test
    public void testStuff(){
    	Assert.assertTrue(shop.verifyStandardPrice());
    }
    
    @Test
    public void testStuff2() {
    	Assert.assertFalse(shop.verifyStandardPrice());
    	
    	
    	
    	
    	
    	
    	
    	
        // perform some sort of test
        // Use Assert.assertTrue(Expression) to verify true/false results.
    }
}
