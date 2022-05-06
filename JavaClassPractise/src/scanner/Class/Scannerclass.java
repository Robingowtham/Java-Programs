package scanner.Class;

import java.util.Scanner;

public class Scannerclass {

	
	public static void main(String[] args) {
		
		Scanner obj1 =new Scanner(System.in);
		
		System.out.println("Enter the product Name:");
		
		String name = obj1.nextLine();
		
		System.out.println("Your product is - "+ name );
		
		System.out.println("Enter the quantity of the product");
		int quantity = obj1.nextInt();
		System.out.println("Quantity is- "+ quantity);
		
		System.out.println("Price of the product");
		int eachPrice =obj1.nextInt();
		System.out.println("Each Rupees "+eachPrice);
		

		
		System.out.println("Enter the discount value- ");
		int discount=obj1.nextInt();
		System.out.println("Discount value- "+discount+ "%");
		
	
		float total =quantity*eachPrice;
		float totalAmount=(total -((discount*total)/100));
		System.out.println("Total Amount ="+totalAmount);
		
		System.out.println("Thanks for visit our Store");
		
	}
}
