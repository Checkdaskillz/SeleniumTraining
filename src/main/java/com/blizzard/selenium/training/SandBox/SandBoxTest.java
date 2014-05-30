package com.blizzard.selenium.training.SandBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.blizzard.selenium.training.BusinessObjects.Shop;
import com.blizzard.selenium.training.PageObjects.BrowsePage;
import com.blizzard.selenium.training.PageObjects.HomePage;
import com.blizzard.selenium.training.PageObjects.ProductDetailsPage;


public class SandBoxTest {
	
	public static void main(String[] arg) {
		WebDriver driver = new FirefoxDriver();
		final Shop shop = new Shop(driver);
		
		if(shop.verifyStandardPrice() == true) {
			System.out.println("pass");
		}else {
				System.out.println("fail");
			}
		}
		
	}
