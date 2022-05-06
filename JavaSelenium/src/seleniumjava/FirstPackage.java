package seleniumjava;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstPackage {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\gowtham\\eclipse-workspace\\JavaSelenium\\updated\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();

//		driver.get("https://www.irctc.co.in/nget/booking/train-list");

		driver.manage().window().maximize();
//		
		driver.navigate().to("http://www.facebook.com/");

//		driver.navigate().back();
//		
//		driver.navigate().forward();
//		
//		driver.navigate().refresh();

//		driver.quit();
//		  
//		driver.close();

//		String title=driver.getTitle();
//		System.out.println(title);
//		 
//		String geturl=driver.getCurrentUrl();
//		System.out.println(geturl);
//	
//		String pagesource=driver.getPageSource();
//		System.out.println(pagesource);

//		Dimension size=new Dimension(500, 500);
//		driver.manage().window().setSize(size);
//		
//		Point p=new Point(300, 300);
//		driver.manage().window().setPosition(p);

//		WebElement username = driver.findElement(By.id("email"));
//		username.sendKeys("0123gowtham0123@gmail.com");
//		
//		WebElement pswd = driver.findElement(By.id("pass"));
//		pswd.sendKeys("gowtham");
//		
//		WebElement login = driver.findElement(By.name("login"));
//		login.click();

		WebElement newacc = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		newacc.click();

		// Timedelay in response
		Thread.sleep(3000);

		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Gowtham");		
		
		WebElement lastname = driver.findElement(By.xpath("//html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input"));
		lastname.sendKeys("K");
		
		WebElement email = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]"));
		email.sendKeys("0123gowtham123@gmail.com");
		
		WebElement email2 = driver.findElement(By.xpath("(//input[@class=\'inputtext _58mg _5dba _2ph-\'])[4]"));
		email2.sendKeys("0123gowtham123@gmail.com");
		
		WebElement pswd = driver.findElement(By.id("password_step_input"));
		pswd.sendKeys("password");

		
		// TakeScreenshot //narrowing cast

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File destination = new File("C:\\Users\\gowtham\\eclipse-workspace\\JavaSelenium\\Output.png");

		FileUtils.copyFile(source, destination);

		
		// Single Dropdown selection tool

		WebElement day = driver.findElement(By.id("day"));

		Select s1 = new Select(day);

		s1.selectByValue("25");

		WebElement month = driver.findElement(By.name("birthday_month"));
		Select s2 = new Select(month);

		s2.selectByIndex(2);

		WebElement year = driver.findElement(By.id("year"));
		Select s3 = new Select(year);

		s3.selectByVisibleText("1995");

		WebElement sex = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
		sex.click();

		WebElement clickup = driver.findElement(By.xpath("//button[@name='websubmit']"));
		clickup.click();
		
		
		// Multiple dropdown
		
		driver.navigate().to("http:/www.leafground.com/");
		
		WebElement dropdown = driver.findElement(By.xpath("(//h5[@class='wp-categories-title'])[5]"));
		dropdown.click();
		
		WebElement multi = driver.findElement(By.xpath("(//select)[6]"));

		Select s = new Select(multi);

		boolean multi1 = s.isMultiple();

		System.out.println("Is multiple dropdown " + multi1);

		s.selectByValue("1");
		s.selectByIndex(3);
		s.selectByVisibleText("Loadrunner");

		List<WebElement> options = s.getOptions();

		for (WebElement webElement : options) {

			System.out.println("Get Options: " + webElement.getText());
		}

		List<WebElement> selected = s.getAllSelectedOptions();

		for (WebElement webElement1 : selected) {

		System.out.println("Get All selected options: " + webElement1.getText());

		}

		WebElement firstoption = s.getFirstSelectedOption();

		System.out.println(firstoption.getText());

		System.out.println("*******************************************************");

		// deselect

		s.deselectByIndex(3);
		s.deselectByValue("1");
		s.deselectByVisibleText("Loadrunner");

		s.deselectAll();

//		int i=678;	Octal value cant be accecpted
//		
//		System.out.println(i);
//	

//	for(t=i; t<=f;t++)
//	{
//		System.out.println("Printing 1 to 1000 "+t);
//	}
	}
}
