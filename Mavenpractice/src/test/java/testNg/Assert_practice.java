package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_practice {

	@Test
	private void test() {
		String expected_UserName="Robin";
		String actual_UserName="RobinHood";
		
		//vrrification
		
		Assert.assertNotEquals(expected_UserName, actual_UserName);
		
	}
}