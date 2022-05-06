package com.adactin.runner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Cucumber.Base_Class;
import com.adactin.POModel.POManager;


public class Adactin_Runner extends Base_Class {

	public static WebDriver driver=Base_Class.findBrowser("chrome");
	
	public static POManager pom=new POManager(driver);
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		GetUrl("https://adactinhotelapp.com/");
		
		sendKeysda(pom.getLp().getUsername(), "gowthamkg25");
		
		sendKeysda(pom.getLp().getPassword(), "gowtham");
		
		clickda(pom.getLp().getLogin());
		
		multipledropdown(pom.getSp().getLocation(), "SelectByvisibleText","London");
		
		multipledropdown(pom.getSp().getHotels(), "SelectByvisibleText", "Hotel Sunshine");
		
		multipledropdown(pom.getSp().getRoom_type(), "SelectByvisibleText", "Super Deluxe");
		
		multipledropdown(pom.getSp().getNo_of_rooms(), "Selectbyindex", "4");
		
		sendKeysda(pom.getSp().getCheckin(), "28/04/2022");
		sendKeysda(pom.getSp().getCheckout(), "04/05/2022");
		
		multipledropdown(pom.getSp().getNo_of_rooms(), "Selectbyindex", "3");
		
		multipledropdown(pom.getSp().getChilds(), "Selectbyindex", "2");
		
		clickda(pom.getSp().getSubmit());
		
		radioButton(pom.getSelh().getRadio());
		
		clickda(pom.getSelh().getSubmit());
		
		sendKeysda(pom.getBh().getFirst_name(), "Robin");
		sendKeysda(pom.getBh().getLast_name(), "K");
		sendKeysda(pom.getBh().getAddress(), "Address");
		sendKeysda(pom.getBh().getCc_num(), "1234567890123456");
		
		multipledropdown(pom.getBh().getCc_type(), "SelectByvisibleText", "American Express");
		multipledropdown(pom.getBh().getCc_exp_month(), "SelectByValue", "6");
		multipledropdown(pom.getBh().getCc_exp_year(), "SelectByValue", "2022");
		sendKeysda(pom.getBh().getCc_cvv(), "258");
		clickda(pom.getBh().getBook_now());
		
		clickda(pom.getBh().getItinerary());
		clickda(pom.getBh().getLogout());
		
//		implicitTimeOut(20);
	
		Thread.sleep(5000);
		
		screenShot("C:\\Users\\gowtham\\eclipse-workspace\\Cucumber\\ScreenShot\\adactin.png");
		
	}
}
