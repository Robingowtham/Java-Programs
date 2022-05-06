package testNg;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGPractice {

	@Test(invocationCount=2, enabled =false)
	private void A() {
		System.out.println("D");

	}
	
	@Test(dependsOnMethods = "A1")
	private void B() {
		System.out.println("C");
	}
	
	@Test(invocationCount=2, dependsOnMethods = "B1")
	private void C() {
		System.out.println("B");

	}
	
//	@Test(groups= {"Set 1"})
//	private void D() {
//		System.out.println("A");
//	}
//	
//	@Test(groups= {"Set 1"})
//	private void ThirdGear() {
//		System.out.println("Third Gear");
//
//	}
//	
//	@Test(groups= {"Set 2"})
//	private void FourthGear() {
//		System.out.println("Fourth Gear");
//
//	}
//
//	@Test(groups= {"Set 2"})
//	private void MusicSystem() {
//		System.out.println("Music on System");
//
//	}

}


