package oops.polymorphism;

public class Student1 extends college {

	@Override
	public void studentname(String name) {
		// TODO Auto-generated method stub
		super.studentname(name);
	}

	@Override
	public void admissiondetails(String degree, int admissionNo, String place) {
		// TODO Auto-generated method stub
		super.admissiondetails(degree, admissionNo, place);
	}

	@Override
	public void hostel(String name) {
		// TODO Auto-generated method stub
		super.hostel(name);
	}

	public static void main(String[] args) {
		
		Student1 obj = new Student1();
		obj.studentname("RobinHood");
		obj.admissiondetails("Bsc", 354212, "Coimbatore" );
		obj.hostel("Yes");
	}
	
}
