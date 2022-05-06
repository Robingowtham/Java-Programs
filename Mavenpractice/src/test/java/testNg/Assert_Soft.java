package testNg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Soft {

	@Test
	private void soft() {

	String act_UserName="Robin";
	String exp_userName="Robinhood";
	
	//Verification
	
	SoftAssert sa=new SoftAssert();
	
	sa.assertEquals(act_UserName, exp_userName);
	
	
	System.out.println("Assert Verified");
	sa.assertAll();
			
	
	
	}
	
	
}
