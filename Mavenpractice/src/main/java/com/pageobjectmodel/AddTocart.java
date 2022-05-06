package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTocart {

	public static WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"add_to_cart\"]/button/span")
	private WebElement addProduct;
	
	@FindBy(xpath="/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span")
	private WebElement checkOut;

	@FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]/span")
	private WebElement Checkout2;
	
	public WebElement getCheckout2() {
		return Checkout2;
	}


	public AddTocart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getAddProduct() {
		return addProduct;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}
	
	
}
