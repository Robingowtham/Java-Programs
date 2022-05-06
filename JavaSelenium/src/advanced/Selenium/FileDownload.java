package advanced.Selenium;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownload {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gowtham\\eclipse-workspace\\JavaSelenium\\updated\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.java.com/en/download");
		
		WebElement clickok = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/span[4]/div/a/span"));
		clickok.click();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		File fileLocation=new File("C:\\Users\\gowtham\\Downloads");
		
		File[] totalfiles=fileLocation.listFiles();
		
		for (File file : totalfiles) {
			
			if(file.getName().equals("jre-8u321-windows-x64")) {
			
				System.out.println("File is downloaded");
				break;
			
			}
		
		}
	
	}

}
