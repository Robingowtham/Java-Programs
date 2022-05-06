package seleniumjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicWait {

	public static void main(String[] args) throws InterruptedException {
	

		System.setProperty("webdriver.chrome.driver","C:\\Users\\gowtham\\eclipse-workspace\\JavaSelenium\\updated\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();

		driver.get("http://www.facebook.com/");
	
		WebElement create=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
		create.click();
		

//		WebElement first=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/input"));
		
//		first.sendKeys("Gowtham");
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	//implicit wait wont react untill 
		
//		Thread.sleep(10000);
		//explicit wait for such time and react if element is wrong
		
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/input"))).sendKeys("Gowtham");
		
		
			
	
	}

}
