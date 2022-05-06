package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;
import org.openqa.selenium.support.ui.Select;

public class AlertPractiseSelenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gowtham\\eclipse-workspace\\JavaSelenium\\updated\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
//		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
//		
//		driver.navigate().back();
//		
//		WebElement username = driver.findElement(By.name("username"));
//		username.sendKeys("GowthamRobin");
//
//		WebElement pswd1 = driver.findElement(By.name("password"));
//		pswd1.sendKeys("gowtham");
//		
//		WebElement click2 = driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']"));
//		click2.click();
	
		
		//*Alert !!! *//
		
		
		//Simple alert-1
		WebElement simple = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		simple.click();
		//only accept on alert
		driver.switchTo().alert().accept();
		
		//confirm alert -2, by ok or cancel
		WebElement click2 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		click2.click();
		
		WebElement confirm = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		confirm.click();
		//Confirm ok
		driver.switchTo().alert().accept();
		
		WebElement confirm2 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		confirm2.click();
		//Confirm cancel
		driver.switchTo().alert().dismiss();
		
		//Promt Alert-3,
		//enter text value on the alert box
		WebElement click3 = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		click3.click();
		
		WebElement option3 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		option3.click();
		
		driver.switchTo().alert().sendKeys("Robin");
		driver.switchTo().alert().accept();
		
		WebElement display = driver.findElement(By.id("demo1"));
		//also display the entered text value in console
		System.out.println(display.getText());
		
	}

}
		//Alert methods to call and its types
		//1.accept
		//2.dismiss
		//3.sendkeys
		//4.gettext
