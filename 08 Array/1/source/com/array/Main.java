package com.array;

import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		// Assignment
		System.out.println("Assignment Array");

		int[] array1 = {1,2,3,4,5};

		array1[0] = 10;

		System.out.println(array1 + " <--- Address array1"); 
		System.out.println(array1[0]); 
		System.out.println(array1[1]); 
		System.out.println(array1[2]); 
		System.out.println(array1[3]); 
		System.out.println(array1[4]); 

		// Declaration of Array Variables
		System.out.println();
		System.out.println("Declaration Array");
		float[] array2 = new float[5];

		array2[4] = 10.5f;
		array2[1] = 10;

		System.out.println(array2 + " <--- Address array2"); 
		System.out.println(array2[0]); 
		System.out.println(array2[1]); 
		System.out.println(array2[2]); 
		System.out.println(array2[3]); 
		System.out.println(array2[4]);

		// Change Array to String
		System.out.println();		
		System.out.println("Data Array");		
		System.out.println(Arrays.toString(array1));		
		System.out.println(Arrays.toString(array2));		

	}
}