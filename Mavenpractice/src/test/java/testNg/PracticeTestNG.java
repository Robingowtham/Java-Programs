package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class PracticeTestNG {
	
	@AfterSuite
	private void OpenDoor() {
		System.out.println("Open the House Door");
	}
	@BeforeTest
	private void KeyStand() {
		System.out.println("Key on Stand");
	}
	@BeforeClass
	private void Light() {
		System.out.println("Light On in the room");
	}
	@BeforeMethod
	private void Music() {
		System.out.println("Switch on the music");
	}
	@Test
	private void Food() {
		System.out.println("Prepare food");
	}
	@AfterMethod
	private void DrinkCoffee() {
		System.out.println("Drink Coffee");
	}
	@AfterTest
	private void CleanRoom() {
		System.out.println("Clean Room");
	}
	@AfterTest
	private void ReadBooks() {
		System.out.println("Read Books");
	}
	@BeforeSuite
	private void TakeRest() {
		System.out.println("Take Rest");
	}
}


