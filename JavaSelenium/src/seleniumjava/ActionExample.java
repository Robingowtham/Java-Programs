package seleniumjava;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.commons.exec.launcher.Java13CommandLauncher;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.base.BaseClass;

public class ActionExample extends BaseClass {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gowtham\\eclipse-workspace\\JavaSelenium\\updated\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http:/www.amazon.in/");

		driver.manage().window().maximize();

		// Click and drag methods by using mouse
		//Using Action class
		
		Actions a=new Actions(driver);
		
//		WebElement element1 = driver.findElement(By.id("draggable"));
//
//		WebElement element2 = driver.findElement(By.id("droppable"));
//		
//		a.click(element1).build().perform();
//		
//		a.clickAndHold(element1).perform();
//		a.moveToElement(element2).perform();
//		a.release(element2).perform();
		
//		driver.close();
		
		//using drag and drop methods
		/*
		Actions act=new Actions(driver);
		
		WebElement element11 = driver.findElement(By.id("draggable"));

		WebElement element12 = driver.findElement(By.id("droppable"));
		//by using single methods drag and drop
		act.dragAndDrop(element11, element12).build().perform();
		*/

		//Robot
		Robot r=new Robot();
		
		WebElement bestseller = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_0']"));
		
		a.contextClick(bestseller).perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement customerService = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_2']"));
		
		a.contextClick(customerService).perform();
				
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		WebElement electronics = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_4']"));
		
		a.contextClick(electronics).perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
			
		
		
		}

}


