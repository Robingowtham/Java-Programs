package testNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Practice {

	
		@Test(dataProvider = "details")
		private void list(String EmpName, int EmpNum) {

		System.out.println("Employee Name: "+EmpName);
		
		System.out.println("Employee Number: "+EmpNum);
				
	}

		@DataProvider
		private Object details() {

			return new Object [][] {
				
			{"Saravadi", 25000	},
			{"Sravani" , 25001 	},
			{"Gurubhai", 25020	},
			{"RockyBhai" , 25025 }
		};
}
}