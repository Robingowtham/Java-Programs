package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectDress {

	public static WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private  WebElement dressSelection;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div[2]/ul/li[5]/div/div[2]/h5/a")
	private WebElement addToCart;

	public SelectDress(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getDressSelection() {
		return dressSelection;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}
	
}
