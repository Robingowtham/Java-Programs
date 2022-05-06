package lao.learning;

public class BankAccount {

	long accountnumber=987654321l;
	String Accountholdername="Robin";

	Integer accountbalance=550;
	
	public void getbalance() {
		System.out.println("balance is "+ accountbalance);
		 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub//
		BankAccount account=new BankAccount();
		account.getbalance();
		
		
	}

}
