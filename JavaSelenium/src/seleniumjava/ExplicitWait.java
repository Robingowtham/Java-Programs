package seleniumjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gowtham\\eclipse-workspace\\JavaSelenium\\updated\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

//		driver.manage().window().maximize();

		driver.navigate().to("http://www.facebook.com/");

		WebElement newacc = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		newacc.click();
		
//		Explicit Wait

//		WebDriverWait wait = new WebDriverWait(driver, 10);

//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/input"))).sendKeys("Gowtham");

//		wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//*[@id=\"day\"]/option[17]")));
		
		
		
		
//		implicit wait
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement pswd = driver.findElement(By.id("password_step_input"));
		pswd.sendKeys("password");
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Gowtham");

		WebElement lastname = driver.findElement(By.xpath("//html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input"));
		lastname.sendKeys("K");

		WebElement email = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]"));
		email.sendKeys("0123gowtham123@gmail.com");
		
		WebElement email2 = driver.findElement(By.xpath("(//input[@class=\'inputtext _58mg _5dba _2ph-\'])[4]"));
		email2.sendKeys("0123gowtham123@gmail.com");
		
	


//		WebElement pswd = driver.findElement(By.id("password_step_input"));
//		pswd.sendKeys("password");
		
		
		
		

	}

}
