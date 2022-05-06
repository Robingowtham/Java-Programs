package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentMethod {

	private WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	private WebElement payment;
	
	@FindBy(xpath="//*[@id=\"cart_navigation\"]/button/span")
	private WebElement confirm;

	public PaymentMethod(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	

	public WebElement getPayment() {
		return payment;
	}

	public WebElement getConfirm() {
		return confirm;
	}
	
	
}
