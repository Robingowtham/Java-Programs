package com.adactin.POModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotel {

	public static WebDriver driver;

	@FindBy(id = "first_name")
	private WebElement first_name;

	@FindBy(id = "last_name")
	private WebElement last_name;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement cc_num;

	@FindBy(id = "cc_type")
	private WebElement cc_type;

	@FindBy(id = "cc_exp_month")
	private WebElement cc_exp_month;

	@FindBy(id = "cc_exp_year")
	private WebElement cc_exp_year;

	@FindBy(id = "cc_cvv")
	private WebElement cc_cvv;

	@FindBy(id = "book_now")
	private WebElement book_now;
	
	@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[2]")
	private WebElement Itinerary;
	
	@FindBy(id="logout")
	private WebElement logout;
	
	
	public BookAHotel (WebDriver driver) {
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
	}

	

	public WebElement getItinerary() {
		return Itinerary;
	}



	public WebElement getLogout() {
		return logout;
	}



	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc_num() {
		return cc_num;
	}

	public WebElement getCc_type() {
		return cc_type;
	}

	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}

	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}

	public WebElement getCc_cvv() {
		return cc_cvv;
	}

	public WebElement getBook_now() {
		return book_now;
	}
}
