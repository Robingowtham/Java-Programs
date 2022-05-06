package java.seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\gowtham\\eclipse-workspace\\JavaSelenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		WebElement radio=driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[6]"));
		
		radio.click();
		
		WebElement uncheck=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/label[2]/input"));
		WebElement check=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/label[3]/input"));
		
		Boolean status1=uncheck.isSelected();
		Boolean status2=check.isSelected();
		
		System.out.println(status1);
		System.out.println(status2);
		
		WebElement age_selection = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input[2]"));
		
		age_selection.click();
		
	}

}
