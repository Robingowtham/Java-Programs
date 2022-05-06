package com.adactin.POModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectedHotel {
public static WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement Radio;
	
	
	@FindBy(id="continue")
	private WebElement Submit;
	
	
	public SelectedHotel(WebDriver driver) {
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
	}



	public WebElement getRadio() {
		return Radio;
	}


	public WebElement getSubmit() {
		return Submit;
	}
}
