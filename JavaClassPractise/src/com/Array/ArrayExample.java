package com.Array;

import java.util.Arrays;

public class ArrayExample {
	
	public static void main(String[] args) {
		
	int a[] = new int[5];
			
	a[0]=20;
	
	a[1]=30;
	
	a[2]=40;
	
	a[3]=50;
	
	a[4]=500;
	
	long arr[] = {1, 2, 3, 4, 5};
	
	for (long i : arr) {

		System.out.println(i);
	}
	
	for(int i=0; i<a.length; i++) 
	
		
	System.out.println(a[1]);
	System.out.println(Arrays.toString(arr));
	System.out.println(Arrays.toString(a));
	
	
}
}