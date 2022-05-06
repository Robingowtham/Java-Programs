package seleniumjava;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartExample {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\gowtham\\eclipse-workspace\\JavaSelenium\\updated\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https:/www.google.com/");
		
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));

		search.sendKeys("Flipkart");
		
		//Robot created for keyboard action on browser
		Robot r=new Robot();
		
		//Also we can give enter by direct
//		a.keyPress(KeyEvent.VK_ENTER);
//		a.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement enterbutton = driver.findElement(By.name("btnK"));
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement clickbutton = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
		
		clickbutton.click();
		
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		
	
		WebElement closebutton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		closebutton.click();
		
		//Action created for mouse actions
		Actions a=new Actions(driver);
		
		WebElement topoffers = driver.findElement(By.xpath("(//div[@class='xtXmba'])[1]"));

		a.contextClick(topoffers).perform();
				
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement mobiles = driver.findElement(By.xpath("(//div[@class='xtXmba'])[3]"));
		
		a.contextClick(mobiles).perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//Windows Handling
		
		Set<String> windowtab = driver.getWindowHandles();
		
		for (String string : windowtab) {

			System.out.println(driver.switchTo().window(string).getTitle());
			
		}
		
		String title1 ="Mobile hones Online at Best Prices in India";
		String title2 ="Flipkart Offers & Deals of the Day - Get Best Discounts on Mobiles, Electronics, Fashion & Home etc.";
		String title3 ="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		
	
		for (String t1 : windowtab) {
			
			if (driver.switchTo().window(t1).getTitle().equals(title1)) {
				break;
			}
			
		}
	
//		for (String t2 : windowtab) {
//			if (driver.switchTo().window(t2).getTitle().equalsIgnoreCase(title2)) {
//				break;
//			}
//		}
//		
//		for (String t3 : windowtab) {
//			if (driver.switchTo().window(t3).getTitle().equalsIgnoreCase(title3)) {
//				break;
//			}
//		}
		
			
	
	}

}
