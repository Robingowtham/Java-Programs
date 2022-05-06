package oops.polymorphism;

public class Student2 extends college{

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
	Student2 obj =new Student2();
	obj.studentname("Hulk");
	obj.admissiondetails("Bcom", 56242, "Tiruppur");
	obj.hostel("No");
}
}
