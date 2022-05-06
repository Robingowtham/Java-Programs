package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.testng.annotations.Test;

public class CrossBrowserTest {

	@Test
	private void weekend() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\gowtham\\eclipse-workspace\\Mavenpractice\\Driver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.google.com/");
	}

	@Test
	private void WeekDays() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
		driver.get("http://www.bing.com/");
	}
}
