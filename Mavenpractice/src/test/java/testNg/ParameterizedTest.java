package testNg;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class ParameterizedTest {

	@Test
	@Parameters({"userName", "pswd"})
	private void login( @Optional("RobinHood")String userName, String pswd) {
		
		System.out.println("User Name "+userName);
		System.out.println("Password "+pswd);
	}
	
}

	//Parameters only runs in xml file
	//Optional can be given instead of added in xml input
	//we can add in xml for the input