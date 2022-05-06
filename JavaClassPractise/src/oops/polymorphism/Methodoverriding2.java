package oops.polymorphism;

public class Methodoverriding2 extends Methodoverriding1{

	@Override
	public void bank(String name) {
		// TODO Auto-generated method stub
		super.bank(name);
	}

	@Override
	public void customerName(String customerName, int accountNumber, int balance) {
		// TODO Auto-generated method stub
		super.customerName(customerName, accountNumber, balance);
	}

	@Override
	public void customerBalance(int currentBalance, int monthlyAvgBalance) {
		// TODO Auto-generated method stub
		super.customerBalance(currentBalance, monthlyAvgBalance);
	}

	public static void main(String[] args) {
		
		Methodoverriding2 obj =new Methodoverriding2();
		
		obj.bank("Robin World Bank");
		obj.customerName("Robin", 123456789, 500);
		obj.customerBalance(500, 1000);
	}
	
}

