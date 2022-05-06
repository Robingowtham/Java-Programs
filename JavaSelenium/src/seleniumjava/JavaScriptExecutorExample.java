package seleniumjava;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorExample {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gowtham\\eclipse-workspace\\JavaSelenium\\updated\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.amazon.in");
		
		driver.manage().window().maximize();
		
		//JavascriptExecutor
		
		JavascriptExecutor js= (JavascriptExecutor) driver; //Narrowing
		
		js.executeScript("window.scrollBy(0, 1000)");	//vertical scroll down

		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-500)");	//Vertical scroll up
		
		js.executeScript("window.scroll(0,0)", "");	//origin page //home page starting page
				
//		driver.get("http:/www.album.alexflueras.ro/");	//horizontal view scroll

//		js.executeScript("window.scrollBy(30000,0)");
				
		//scroll and view then click
		WebElement mobile = driver.findElement(By.xpath("(//img[@class='landscape-image'])[18]"));
		js.executeScript("arguments[0].scrollIntoView()", mobile);
		js.executeScript("arguments[0].click()", mobile);

		
		//another method to send keys and click button
		
		js.executeScript("document.getElementById('twotabsearchtextbox').value='mobiles below 10000'");	//sendkeys by javascriptexecutor
		
		WebElement clickbutton = driver.findElement(By.id("nav-search-submit-button"));
		
		js.executeScript("arguments[0].click()",clickbutton);	//by using argument clickbutton
			
		js.executeScript("location.reload()");	//reloading by using scriptexecutor
		
		
		
		
		
	}

}
