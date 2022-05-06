package myLearning;



public class ReverseString {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Gowtham");
		
		System.out.println(s);
		
		System.out.println(s.reverse());
				
		String g="Gowtham";
		
		System.out.println(g);
		
	
		char[] ar=g.toCharArray();
		
//		System.out.println(g.hashCode());
		
		for(int i=ar.length-1; i>=0;--i) {
			System.out.print(ar[i]);
		}
			
		
		
	}

}
