package testNg;

import org.testng.annotations.Test;

public class GroupsOfGroupPractice {

	
	@Test(groups = "Gadgets")
	private void Mobiles() {
		System.out.println("Mobiles");
	}

	@Test(groups = "Gadgets")
	private void ipad() {
		System.out.println("Ipad");
	}

	@Test(groups="food")
	private void Pizaa() {
		System.out.println("Pizaa");
	}

	@Test(groups="food")
	private void pasta() {
		System.out.println("pasta");
	}
	
	
}
