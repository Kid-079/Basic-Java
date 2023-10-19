package com.array;

import java.util.Arrays;

public class Main {
	public static void main(String[] args){

		int[] array1 = {1,2,3,4,5};
		int[] array2 = new int[5];

		// Check Memory Address
		System.out.println(array1);
		System.out.println(array2);

		// array2 = array1;     // return reference/address memory not value

		System.out.println(array1);
		System.out.println(array2);
		System.out.println("Array 1 = " + Arrays.toString(array1));
		System.out.println("Array 2 = " + Arrays.toString(array2));

		array1[0] = 100;
		array2[4] = 400;
		System.out.println("Array 1 = " + Arrays.toString(array1));
		System.out.println("Array 2 = " + Arrays.toString(array2));

		System.out.println();
		changeArray1(array1);
		System.out.println("Array 1 = " + Arrays.toString(array1));
		// changeArray1(array1);
		
		System.out.println();
		changeArray2(array2);
		System.out.println("Array 2 = " + Arrays.toString(array2));
	}

	private static void changeArray1(int[] dataArray){
		for(int data : dataArray){
			System.out.println(data);
		}

		dataArray[0] = 5;
		dataArray[2] = 10;
	}

	private static void changeArray2(int[] dataArray){
		for(int data : dataArray){
			System.out.println(data);
		}

		dataArray[0] = 10;
		dataArray[1] = 20;

	}
}