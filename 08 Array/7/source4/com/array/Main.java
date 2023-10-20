package com.array;

import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		System.out.println("\nArray Multidimensi\n====================");

		System.out.println("Access Array Address");
		int[][] array_2D = {
			{1,2},
			{3,4}
		};
		printArray2D(array_2D);		

		int[][] arrayValue = new int[5][4];
		printArray2D(arrayValue);

		// Show Address 
		System.out.println(Arrays.toString(arrayValue));

		// Looping Foreach
		// for(int[] row : arrayValue){
		// 	System.out.print("[");
		// 	for(int value : row){
		// 		System.out.print(value + ",");
		// 		// System.out.println(Arrays.toString(arrayValue));    // Show Address
		// 	}
		// 	System.out.print("]\n");
		// }
	}

	private static void printArray2D(int[][] dataArray){
		System.out.println("{");
		for(int[] row : dataArray){
			System.out.print("[");
			for(int value : row){
				System.out.print(value + ",");
			}
			System.out.print("]\n");
		}
		System.out.println("}");
	}

	// private static void printArray2D(int[][] dataArray){
	// 	for(int i = 0; i < dataArray.length; i++){
	// 		System.out.println(Arrays.toString(dataArray[i]));
	// 	}
	// }
}