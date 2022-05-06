package com.ProjectOne;

import com.base.BaseClass;
import com.pageobjectmodel.AddTocart;
import com.pageobjectmodel.CheckOut;
import com.pageobjectmodel.HomePage;
import com.pageobjectmodel.LoginPage;
import com.pageobjectmodel.PaymentMethod;
import com.pageobjectmodel.SelectDress;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class RunnerClass1 extends BaseClass{

	public static WebDriver driver=BaseClass.findBrowser("chrome");
	
	public static HomePage hp=new HomePage(driver);
	public static LoginPage lp=new LoginPage(driver);
	public static SelectDress sd=new SelectDress(driver);
	public static AddTocart cart=new AddTocart(driver);
	public static CheckOut cout=new CheckOut(driver);
	public static PaymentMethod order=new PaymentMethod(driver);
	
	public static void main(String[] args) throws IOException {
		
		maximiseBrowser();
		
		GetUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		clickda(hp.getSignIn());
		
		
		sendKeysda(lp.getEmail(), "12341161xv1yy@gmail.com");
		
		sendKeysda(lp.getPswd(), "password");
		
		clickda(lp.getSubmit());
		
		clickda(sd.getDressSelection());
		
		clickda(sd.getAddToCart());
		
		clickda(cart.getAddProduct());
		implicitTimeOut(5);
		
		clickda(cart.getCheckOut());
		
		clickda(cart.getCheckout2());
		
		sendKeysda(cout.getSendKeysValue(),"Gift Pack This Order");
		
		clickda(cout.getCheckoutorder());
		
		clickda(cout.getCondition());
		
		clickda(cout.getOrderConfirm());
		
		clickda(order.getPayment());
		clickda(order.getConfirm());
		screenShot("C:\\Users\\gowtham\\eclipse-workspace\\Mavenpractice\\ScreenShot1.png");
		
		
		
	}

}
