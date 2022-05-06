package learn.Programming;

import java.util.Iterator;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		//		Scanner s=new Scanner (System.in);
//		
//		Integer n = s.nextLine() ;
//		
//		System.out.println("Entered number " + n);
		
		int n=7;
		int count=0;
		//boolean prime=true

		for (int i = 2; i<n; i++) {
			
			if (n%i==0) {
				System.out.println(n+" not a prime");
				count++;
				//prime=false
			}
			//prime=true
		}if (count==0) {
			
			System.out.println(n+ " is a prime");
		}
		
	}

}
