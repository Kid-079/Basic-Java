package com.array;

import java.util.Arrays;

public class Main {
	public static void main(String[] args){

		// Count 2 Array
		System.out.println("\nCount 2 Array\n==================");
		int[] array1 = {2,3,4,5,8,9,6,4,1};
		int[] array2 = {1,6,8,7,9,5,4,3,2};

		int[] arrayTotal1 = new int [array1.length];
		
		for(int i = 0; i < array1.length; i++){
			arrayTotal1[i] = array1[i] + array2[i];
		}

		printArray(array1);
		printArray(array2);
		printArray(arrayTotal1);


		// Combine 2 Array
		System.out.println("\nCombine 2 Array\n==================");
		int[] arrayTotal2 = new int [array1.length + array2.length];
		
		for(int i = 0; i < array1.length; i++){
			arrayTotal2[i] = array1[i];
		}

		for(int i = 0; i < array2.length; i++){
			arrayTotal2[i + array1.length] = array2[i];
		}

		printArray(array1);
		printArray(array2);
		printArray(arrayTotal2);


		// Reverse Array
		System.out.println("\nReverse Array\n==================");
		printArray(array1);
		Arrays.sort(array1);
		printArray(array1);
		
		int[] arrayBuffer = Arrays.copyOf(array1, array1.length);		


		for(int i = 0; i < array1.length; i++){
			array1[i] = arrayBuffer[(arrayBuffer.length-1) - i];
		}

		printArray(array1);

	}

	private static void printArray(int[] dataArray){
		System.out.println("Array --> " + Arrays.toString(dataArray));
	}
}