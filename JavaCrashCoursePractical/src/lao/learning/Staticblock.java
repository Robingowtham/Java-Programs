package lao.learning;

public class Staticblock {

	static {
		System.out.println("Inside Static block 1");
	}
	static {
		System.out.println("Inside static block 2");
	}
	public static void main(String[] args) {
		
		System.out.println("Inside main method");
	}
}

