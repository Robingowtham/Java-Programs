package com.ProjectOne;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.base.BaseClass;

public class AdactinRunnerClass extends BaseClass {

	public static void main(String[] args) {

		findBrowser("chrome");

		maximiseBrowser();

		driver.get("https://www.facebook.com/");

		WebElement createAccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));

		clickda(createAccount);

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		WebElement firstName = driver.findElement(By.name("firstname"));

		sendKeysda(firstName, "Gowtham");

//		closeMe();

//		quitMe();

//		GetUrl("http:/www.google.com/");
//		
//		currentUrl2();
//		
//		navigateMethod("http://demo.automationtesting.in/Alerts.html");
//		
//		navigteBack();
//		navigateForward();
//		

//		WebElement alertClick=driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
//		clickda(alertClick);
//		alertSimple();
//		
//		WebElement clickOk=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
//		clickda(clickOk);
//		
		WebElement clickButton = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		clickda(clickButton);
		alertAccept("ok");
		alertAccept("cancel");

//		WebElement gettext1=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/p"));
//		alertAccept(null, "gettext");

//		implictTimeOut(3);
//		
//		WebElement clickButton2 =driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
//		clickda(clickButton2);
//		
//		WebElement clickButton3 =driver.findElement(By.xpath("//*[@id=\'CancelTab\']/button"));
//		clickda(clickButton3);
//		
//		alertDismiss();
//		
//		WebElement displayText=driver.findElement(By.xpath("//*[@id=\"demo\"]"));
//		
//		getTextHere(displayText);

//		currentUrl(driver);

//		GetUrl("http://www.leafground.com/pages/Dropdown.html");

//		WebElement javaOption=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[1]"));
//		
//		enableOptionda(javaOption);
//		
//		SelectedOption(javaOption);
//		
//		clickda(javaOption);
//		
//		SelectedOption(javaOption);
//		
//		displayOption(javaOption);
//		
//		WebElement seleniumOption=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/input"));
//		
//		System.out.println("**********");
//		
//		SelectedOption(seleniumOption);
//		
//		enableOptionda(seleniumOption);
//		
//		clickda(seleniumOption);
//		
//		SelectedOption(seleniumOption);
//		
//		displayOption(seleniumOption);
//		
//		GetUrl("http://demo.automationtesting.in/Frames.html");
//		
//		WebElement frame1=driver.findElement(By.xpath("//*[@id=\'singleframe\']"));
//		
//		framesOptions(frame1, "Frame");
//		
//		WebElement textbox=driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
//				
//		sendKeysda(textbox, "gow");

//		WebElement multidrop=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
//	
//		attributeValue(multidrop);

//		GetUrl("http://www.amazon.com/");
//		windowUpDown(0, 1000);
//		windowUpDown("window.scrollBy(0,1000)");

	}

}
