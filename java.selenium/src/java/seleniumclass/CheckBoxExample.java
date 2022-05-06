package java.seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckBoxExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gowtham\\eclipse-workspace\\java.selenium\\chrome\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/checkbox.html");
	
		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input"));
		checkbox1.click();
		
		
		
	}

}
