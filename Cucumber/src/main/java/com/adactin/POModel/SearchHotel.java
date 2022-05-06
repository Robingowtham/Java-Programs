package com.adactin.POModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {

	public static WebDriver driver;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(name="room_type")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement room_nos;
	
	@FindBy(id="datepick_in")
	private WebElement Checkin;
	
	@FindBy(id="datepick_out")
	private WebElement Checkout;
	
	
	@FindBy(id="adult_room")
	private WebElement No_of_rooms;
	
	@FindBy(id="child_room")
	private WebElement childs;
	
	@FindBy(id ="Submit")
	private WebElement Submit;
	
	public SearchHotel (WebDriver driver) {
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
	}

	


	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_type() {
		return roomType;
	}

	public WebElement getRoom_nos() {
		return room_nos;
	}

	public WebElement getCheckin() {
		return Checkin;
	}

	public WebElement getCheckout() {
		return Checkout;
	}

	public WebElement getNo_of_rooms() {
		return No_of_rooms;
	}

	public WebElement getChilds() {
		return childs;
	}

	public WebElement getSubmit() {
		return Submit;
	}
	
}
