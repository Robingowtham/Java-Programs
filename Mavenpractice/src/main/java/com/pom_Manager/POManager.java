package com.pom_Manager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.pageobjectmodel.AddTocart;
import com.pageobjectmodel.CheckOut;
import com.pageobjectmodel.HomePage;
import com.pageobjectmodel.LoginPage;
import com.pageobjectmodel.PaymentMethod;
import com.pageobjectmodel.SelectDress;

public class POManager {


	public WebDriver driver;

	private HomePage hp;
	
	private LoginPage lp;
	
	private SelectDress sd;
	
	private AddTocart cart;
	
	private CheckOut cout;
	
	private PaymentMethod order;

	public POManager (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public HomePage getHp() {
		hp=new HomePage(driver);
		return hp;
	}

	public LoginPage getLp() {
		lp=new LoginPage(driver);
		return lp;
	}

	public SelectDress getSd() {
		sd=new SelectDress(driver);
		return sd;
	}

	public AddTocart getCart() {
		cart=new AddTocart(driver);
		return cart;
	}

	public CheckOut getCout() {
		cout = new CheckOut(driver);
		return cout;
	}

	public PaymentMethod getOrder() {
		order=new PaymentMethod(driver);
		return order;
	}
	
}
