package oops.polymorphism;

public class Methodoverloading {

	public void bankDetails(String bankName) {
		System.out.println(bankName);
	}
	

	public void bankdetails(String accountHolderName, long accountNumber) {
		System.out.println(accountHolderName + " "  +accountNumber );
	}
	
	
	public void bankdetails(int accountBalance) {
		System.out.println(accountBalance);
	}
	
	public void bankdetails(String nomineeName) {
		System.out.println(nomineeName);
	}
	public static void main (String [] args) {
		Methodoverloading obj = new Methodoverloading();
		obj.bankDetails("Bank Name");
		obj.bankdetails("Robin", 500);
		obj.bankdetails(12345678);
		obj.bankdetails("RobinHood");
		
	}
}