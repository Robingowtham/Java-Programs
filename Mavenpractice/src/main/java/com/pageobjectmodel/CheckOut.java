package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut {

	private WebDriver driver;
	
	@FindBy(name="message")
	private WebElement sendKeysValue; 
	
	@FindBy(xpath="//*[@id=\"center_column\"]/form/p/button/span")	
	private WebElement Checkoutorder;

	@FindBy(name="cgv")
	private WebElement condition;
	
	@FindBy(xpath="//*[@id=\"form\"]/p/button/span")
	private WebElement orderConfirm;
	
	
	public WebElement getCondition() {
		return condition;
	}

	public WebElement getOrderConfirm() {
		return orderConfirm;
	}

	public CheckOut (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSendKeysValue() {
		return sendKeysValue;
	}

	public WebElement getCheckoutorder() {
		return Checkoutorder;
	}
}
