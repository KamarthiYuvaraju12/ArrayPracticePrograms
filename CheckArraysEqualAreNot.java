package test;

import java.util.Arrays;

public class CheckArraysEqualAreNot {
	public static void main(String[]args) {
	int array[] = {1,2,3,4};
	
	int array1[] = {1,2,3,4};

	boolean results = Arrays.equals(array, array1);
	
	if(results == true) {
		System.out.println("..Arrays Are Equals:");
		
	}else {
		System.out.println("..Arrays Are Not Equals:");
		
	}
	
	}
}
