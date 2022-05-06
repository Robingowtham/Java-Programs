package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public static WebDriver driver;

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "passwd")
	private WebElement pswd;

	@FindBy(id = "SubmitLogin")
	private WebElement submit;

	
	
	public  LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPswd() {
		return pswd;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
