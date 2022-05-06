package learn.Programming;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {

		
		int a,no,arm=0,rem=0;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		no=input.nextInt();
		a=no;
		
		do {			
		
		rem=no%10;
		arm=arm+(rem*rem*rem);
		no=no/10;
		
		}while (no>0);
		System.out.println("print reminder "+arm);
	}

}
