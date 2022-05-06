package lao.learning;

public class Staticmethod {

	public static void mainMethod1() {
		System.out.println("Static method");
	}
	
	public void nonMethod2() {
				
		System.out.println("Non static method");
		
	}
	public static void main(String[] args) {
	
		mainMethod1();
		
		Staticmethod method= new Staticmethod();
		
		method.nonMethod2();
	}
}
