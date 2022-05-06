package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExamples {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gowtham\\eclipse-workspace\\JavaSelenium\\updated\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");

		driver.manage().window().maximize();
		
		
		//Single frame
		WebElement single = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(single);
		
		//send keys on frame text box
		WebElement singletxt = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		singletxt.sendKeys("jAvA");
	
		//deafult to exit the frame layout
		driver.switchTo().defaultContent();
		
		//Multiframe 		
		WebElement selectmulti = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		selectmulti.click();
		//frame1
		WebElement multidrop1 = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
		driver.switchTo().frame(multidrop1);
		//frame2
		WebElement multidrop2 = driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])[1]"));
		driver.switchTo().frame(multidrop2);
				
		//text on frame 2
		WebElement multidroptxt = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		multidroptxt.sendKeys("Selenium");
		
		//deafult to exit the frame layout
		driver.switchTo().defaultContent();
		
		driver.close();
	}
	

}
