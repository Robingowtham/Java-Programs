package oops.polymorphism;

public class Methodoverriding1 {

	public void bank(String name) {
		
		System.out.println(name);
	}
	public void customerName(String customerName, int accountNumber, int balance) {
		System.out.println(customerName+" " + accountNumber+ " "+ balance);
	}

	public void customerBalance(int currentBalance, int monthlyAvgBalance) {
		System.out.println(currentBalance + " "+ monthlyAvgBalance );

	}
		
}

