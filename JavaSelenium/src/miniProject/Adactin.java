package miniProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\gowtham\\eclipse-workspace\\JavaSelenium\\updated\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");

		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("gowthamkg25");

		WebElement pswd=driver.findElement(By.name("password"));
		pswd.sendKeys("gowtham");

		WebElement login=driver.findElement(By.name("login"));
		login.click();

		WebElement location = driver.findElement(By.xpath("//*[@id=\'location\']"));

		Select sel=new Select(location);
		sel.selectByValue("Los Angeles");

		WebElement hoteltype=driver.findElement(By.id("hotels"));

		Select sel2 = new Select (hoteltype);
		sel2.selectByValue("Hotel Sunshine");

		WebElement roomType=driver.findElement(By.id("room_type"));

		Select sel3=new Select(roomType);
		sel3.selectByValue("Super Deluxe");

		WebElement numberOfRooms=driver.findElement(By.id("room_nos"));

		Select sel4=new Select (numberOfRooms);
		sel4.selectByIndex(1);

		WebElement checkin=driver.findElement(By.name("datepick_in"));
		checkin.clear();
		checkin.sendKeys("30/03/2022");

		WebElement checkout=driver.findElement(By.name("datepick_out"));
		checkout.clear();
		checkout.sendKeys("01/04/2022");

		WebElement adult=driver.findElement(By.name("adult_room"));

		Select Sel5 = new Select(adult);
		Sel5.selectByValue("2");

		WebElement childrenperroom=driver.findElement(By.id("child_room"));

		Select sel6 = new Select(childrenperroom);
		sel6.selectByValue("2");

		WebElement search=driver.findElement(By.name("Submit"));
		search.click();


		WebElement radiobutton=driver.findElement(By.name("radiobutton_0"));
		radiobutton.click();

		WebElement continue1=driver.findElement(By.name("continue"));
		continue1.click();

		WebElement fName=driver.findElement(By.id("first_name"));
		fName.sendKeys("Robin");

		WebElement lName=driver.findElement(By.id("last_name"));
		lName.sendKeys("K");

		WebElement address=driver.findElement(By.name("address"));
		address.sendKeys("Address"
				+ "Factory Layout eastside");


		WebElement creditCard=driver.findElement(By.name("cc_num"));
		creditCard.sendKeys("12345678912354458");


		WebElement cardType=driver.findElement(By.name("cc_type"));

		Select Sele=new Select(cardType);
		Sele.selectByValue("AMEX");

		WebElement ExpiryMonth=driver.findElement(By.name("cc_exp_month"));

		Select sel5=new Select (ExpiryMonth);
		sel5.selectByIndex(11);

		WebElement ExpiryYear=driver.findElement(By.name("cc_exp_year"));

		Select Sel6=new Select(ExpiryYear);
		Sel6.selectByVisibleText("2017");

		WebElement ccvNumber=driver.findElement(By.id("cc_cvv"));
		ccvNumber.sendKeys("548");

		WebElement bookNow=driver.findElement(By.name("book_now"));
		bookNow.click();

		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\gowtham\\eclipse-workspace\\JavaSelenium\\Output.png");
		
		FileUtils.copyFile(source, dest);
		
		WebElement myItinerary=driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[2]"));
		myItinerary.click();

		WebElement cancel1=driver.findElement(By.name("check_all"));
		cancel1.click();

		WebElement cancelall=driver.findElement(By.name("cancelall"));
		cancelall.click();
		
		driver.switchTo().alert().accept();



	}

}
