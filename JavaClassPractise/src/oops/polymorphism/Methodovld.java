package oops.polymorphism;

public class Methodovld {
	
	public void student(String name) {
		System.out.println(name);
	}

	public void student(String standard, int rollNo) {
		System.out.println(standard+ " "+ rollNo);
	}
    
	public void student(int m1, int m2, int m3, int m4, int m5,int totalmark) {
		System.out.println(m1+ " "+m2+ " " +m3+ " "  +m4+ " " +m5+ "  " +totalmark);
	}
	public static void main(String[] args) {
		Methodovld obj = new Methodovld();
		
		obj.student("Robin");
		obj.student("Ten", 21);
		obj.student(50, 55, 60, 60, 70, 295);
	}
}


