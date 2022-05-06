package typeCasting;

public class Child extends Parent{

	public void property() {

		System.out.println("House and Gold");
	}
	
	public static void main(String[] args) {
		
		Parent obj = new Child();
		obj.shares();
		
		Child obj2=new Child();
		obj2.property();
		
			}
	}
	
