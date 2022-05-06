package java.seleniumclass;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPrgm {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gowtham\\eclipse-workspace\\java.selenium\\chrome\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/booking/train-list");
		
		
		
	}
}
