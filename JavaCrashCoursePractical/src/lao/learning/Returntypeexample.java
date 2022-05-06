package lao.learning;

public class Returntypeexample {
	public Integer collectAmount=1000;
	
	public Integer collectamountandgiveittome() //void cannot be return type 
	//
	
		{System.out.println("Daddy Have collected Rupees " + collectAmount +" and sent it to you");
		return collectAmount;
}
	public static void main(String[] args) {
		// return type
		Returntypeexample mySon=new Returntypeexample();
		Integer amount =mySon.collectamountandgiveittome();
		System.out.println("Got the money son " +amount);
		
	}

}
