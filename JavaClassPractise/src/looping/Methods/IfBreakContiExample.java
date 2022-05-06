package looping.Methods;

public class IfBreakContiExample {

	public static void main(String[] args) {
		
		for (int i=0; i<10; i++) {
			if (i==4) {
				break;
		
		}
			System.out.println(i);
		
		}

		for (int i=0; i<10; i++) {
			if(i==5) {
				continue;
		
		}
			System.out.println(i);
			
		}
	
	}
}

