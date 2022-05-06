package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;


public class HomePage {

	public static WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	
	private WebElement signIn;

	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getSignIn() {
		return signIn;
	}

	
	
	
	
}
