package com.Interface;

public class Developer implements BackEndDevop, FrontEnd, DataBase {

	@Override
	public void memoryAllocation() {
		System.out.println("Memory Allotted");
	}

	@Override
	public void userInterface() {
			System.out.println("User interface");
	}

	@Override
	public void writeCode() {
			System.out.println("Code Written");
	}

	public static void main(String[] args) {
		
		Developer obj = new Developer();
		
		obj.writeCode();
		obj.userInterface();
		obj.memoryAllocation();
	}
	
	
	
}
