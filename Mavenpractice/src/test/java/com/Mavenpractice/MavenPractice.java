package com.Mavenpractice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
		
public class MavenPractice {
		
	
	public static void main(String[] args) throws IOException {
	
		
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		
		WebElement womenClick = driver.findElement(By.xpath("//*[@id=\'block_top_menu\']/ul/li[1]/a"));
		womenClick.click();
		
		WebElement dresses = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/div[2]/ul/li[2]/div[1]/a/img"));
		dresses.click();
			
//		JavascriptExecutor js= (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView()" ,dresses);
//		js.executeScript("arguments[0].click()", dresses);
		
		
		WebElement select1 = driver.findElement(By.xpath("//*[@id=\'center_column\']/ul/li[3]/div/div[2]/h5/a"));
		select1.click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement addCart = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div/p/button/span"));
		addCart.click();
		
		WebElement CheckOut = driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span"));
		CheckOut.click();
		
		WebElement plusButton = driver.findElement(By.xpath("//*[@id=\'cart_quantity_up_5_19_0_0\']/span/i"));
		plusButton.click();
		
		WebElement proceed = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span"));
		proceed.click();
		
		WebElement login = driver.findElement(By.name("email"));
		login.sendKeys("12341161xv1yy@gmail.com");
		
		WebElement pswd1 = driver.findElement(By.name("passwd"));
		pswd1.sendKeys("password");
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
		button.click();
		
//		WebElement gender = driver.findElement(By.id("id_gender1"));
//		gender.click();
		
//		WebElement firstName = driver.findElement(By.id("customer_firstname"));
//		firstName.sendKeys("Robin");
		
//		WebElement lastName = driver.findElement(By.id("customer_lastname"));
//		lastName.sendKeys("K");
		
//		WebElement pswd = driver.findElement(By.name("passwd"));
//		pswd.sendKeys("password");
		
//		WebElement day = driver.findElement(By.id("days"));
//		Select s = new Select(day);
		
//		s.selectByIndex(9);
		
//		WebElement month = driver.findElement(By.id("months"));
		
//		Select s1 = new Select(month);
//		s1.selectByIndex(6);
		
//		WebElement year = driver.findElement(By.id("years"));
//		Select s2 = new Select(year);
		
//		s2.selectByValue("1950");
		
//		WebElement fName = driver.findElement(By.id("firstname"));
//		fName.sendKeys("Robin");
		
//		WebElement lName = driver.findElement(By.id("lastname"));
//		lName.sendKeys("K");
		
//		WebElement cmpy=driver.findElement(By.name("company"));
//		cmpy.sendKeys("Company");
//		
//		WebElement address=driver.findElement(By.id("address1"));
//		address.sendKeys("Address");
//		
//		WebElement address2=driver.findElement(By.id("address2"));
//		address2.sendKeys("Address line 2");
//		
//		WebElement city=driver.findElement(By.id("city"));
//		city.sendKeys("City");
//		
//		WebElement state=driver.findElement(By.name("id_state"));
//		Select s3=new Select (state);
//		
//		s3.selectByValue("38");
//		
//		WebElement zip=driver.findElement(By.name("postcode"));
//		zip.sendKeys("00000");
//		
//		WebElement country=driver.findElement(By.name("id_country"));
//		Select s4=new Select(country);
//		
//		s4.selectByValue("21");
//		
//		WebElement phone=driver.findElement(By.id("phone_mobile"));
//		phone.sendKeys("123456789");
//		
//		WebElement alias=driver.findElement(By.name("alias"));
//		alias.sendKeys("My address");
//		
//		WebElement register=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[4]/button/span"));
//		register.click();
		
		WebElement checkout2=driver.findElement(By.xpath("(//span)[44]"));
		checkout2.click();
		
		WebElement tickBox=driver.findElement(By.id("cgv"));
		tickBox.click();
		
		WebElement checkout3=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button/span"));
		checkout3.click();
		
		WebElement payment =driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));
		payment.click();
		
		WebElement confirm=driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
		confirm.click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File shot1=ts.getScreenshotAs(OutputType.FILE);
		
		File saveas=new File("C:\\Users\\gowtham\\eclipse-workspace\\JavaSelenium\\Output.png");
		
		FileUtils.copyFile(shot1, saveas);
					
	}

}

