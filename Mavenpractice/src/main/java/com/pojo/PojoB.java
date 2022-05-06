package com.pojo;

public class PojoB {

	public static void main(String[] args) {

		PojoA obj = new PojoA();

		int a = obj.getA();

		System.out.println("Before Setter: " + a);

		obj.setA(500);
		
		int a2 = obj.getA();

		System.out.println("After Setter value: " + a2);

		obj.setA(5000);

		int a3 = obj.getA();

		System.out.println("After Setter value: " + a3);
	}

}
