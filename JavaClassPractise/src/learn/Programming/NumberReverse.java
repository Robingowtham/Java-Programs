package learn.Programming;

public class NumberReverse {

	public static void main(String[] args) {

		int no=23456;
		int rem=0;
		
		while (no>0) {
			
		rem=(rem*10)+no%10;
		no=no/10;
		
		}
		
		System.out.println("Reversing number "+ rem);
		
//		for (no=23456; no>0; no=no){
//			
//		rem=(rem*10)+no%10;
//		no=no/10;
//		
//		}
//		
//		System.out.println("Reversing number "+ rem);	
		
	}	
	
}
