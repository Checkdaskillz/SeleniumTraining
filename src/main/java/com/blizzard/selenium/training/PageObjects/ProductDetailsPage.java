package com.blizzard.selenium.training.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage {
		@FindBy(css="span.product-price")
		private WebElement standardPrice;
		
		public WebElement getstandardPrice() {
			return standardPrice;
			
		}
		
}
