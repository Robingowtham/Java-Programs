package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class PrallelTesting {

	@Test
	private void Mobiles() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com/");

	}

	@Test
	private void ipad() {
		System.setProperty("Webdriver.driver.Chrome", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.bing.com/");
	}
}

//Parallel test cases runs in xml file only with double browser with double code
//We can't run in java due to line by line iteration
//