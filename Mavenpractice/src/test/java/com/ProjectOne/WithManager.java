package com.ProjectOne;


import com.base.BaseClass;
import com.pom_Manager.POManager;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class WithManager extends BaseClass{

		public static WebDriver driver=BaseClass.findBrowser("chrome");
		
		public static POManager pom=new POManager(driver);
		
		@Test
		public void main() throws IOException {
			
			maximiseBrowser();
			
			GetUrl("http://automationpractice.com/");
			
			implicitTimeOut(5);
			
			clickda(pom.getHp().getSignIn());
			
			String email = read_Data("D:\\Career\\java\\Test_case.xlsx", "Story 1", 5, 1);
						
			sendKeysda(pom.getLp().getEmail(), email);
			
			String pswd = read_Data("D:\\Career\\java\\Test_case.xlsx", "Story 1", 6, 1);
			
			sendKeysda(pom.getLp().getPswd(), pswd);
			
			clickda(pom.getLp().getSubmit());
			
			clickda(pom.getSd().getDressSelection());
			
			clickda(pom.getSd().getAddToCart());
					
			clickda(pom.getCart().getAddProduct());
			implicitTimeOut(5);
			
			clickda(pom.getCart().getCheckOut());
			
			clickda(pom.getCart().getCheckout2());
			
			sendKeysda(pom.getCout().getSendKeysValue(),"Gift Pack This Order");
			
			clickda(pom.getCout().getCheckoutorder());
			
			clickda(pom.getCout().getCondition());
			
			clickda(pom.getCout().getOrderConfirm());
			
			clickda(pom.getOrder().getPayment());
			clickda(pom.getOrder().getConfirm());
			
			windowUpDown(0, 400);
			
			screenShot("C:\\Users\\gowtham\\eclipse-workspace\\Mavenpractice\\ScreenShot.png");
			
		}

	}


