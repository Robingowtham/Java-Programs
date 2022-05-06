package com.adactin.POModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class POManager {

	public static WebDriver driver;

	private SignInPage lp;
	private SearchHotel sp;
	private SelectedHotel selh;
	private BookAHotel bh;

	public POManager(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public SignInPage getLp() {
		lp = new SignInPage(driver);

		return lp;
	}

	public SearchHotel getSp() {
		sp = new SearchHotel(driver);
		return sp;
	}

	public SelectedHotel getSelh() {
		selh = new SelectedHotel(driver);
		return selh;
	}

	public BookAHotel getBh() {
		bh=new BookAHotel(driver);
		return bh;
	}

	
}
