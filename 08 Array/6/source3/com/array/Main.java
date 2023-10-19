package com.array;

import java.util.Arrays;

public class Main {
	public static void main(String[] args){

		int[] array1 = {2,3,5,8,9,6,7,1,0};
		int[] array2 = {1,2,6,7,9,5,4,3,8};
		
		// Count 2 Array
		System.out.println("\nCount 2 Array\n==================");
		int[] arrayTotal1 = countArray(array1, array2);
		
		printArray(array1, "Array1");
		printArray(array2, "Array2");
		printArray(arrayTotal1, "Total");


		// Combine 2 Array
		System.out.println("\nCombine 2 Array\n==================");
		int[] arrayTotal2 = new int [array1.length + array2.length];
		
		for(int i = 0; i < array1.length; i++){
			arrayTotal2[i] = array1[i];
		}

		for(int i = 0; i < array2.length; i++){
			arrayTotal2[i + array1.length] = array2[i];
		}

		printArray(array1, "Array1");
		printArray(array2, "Array2");
		printArray(arrayTotal2, "Total2");



		// Reverse Array
		System.out.println("\nReverse Array\n==================");
		printArray(array1, "Array1");
		reverse1(array1);
		printArray(array1, "Reverse 1");

		printArray(array2, "Array2");
		reverse2(array2);
		printArray(array2, "Reverse 2");
	}
	
	private static void reverse2(int[] dataArray){
		Arrays.sort(dataArray);
		int buffer;

		for(int i = 0; i < dataArray.length/2; i++){
			buffer = dataArray[i];
			dataArray[i] = dataArray[(dataArray.length - 1) - i];
			dataArray[(dataArray.length - 1) - i] = buffer;
		}
	}

	private static void reverse1(int[] dataArray){
		Arrays.sort(dataArray);
		int[] arrayBuffer = Arrays.copyOf (dataArray, dataArray.length);

		for(int i = 0; i < dataArray.length; i++){
			dataArray[i] = arrayBuffer[(arrayBuffer.length - 1) - i];
		}
	}

	private static int[] countArray(int[] array1, int[] array2){
		int[] arrayTotal = new int [array1.length];

		for(int i = 0; i < array1.length; i++){
			arrayTotal[i] = array1[i] + array2[i];
		}
		return arrayTotal;
	}


	private static void printArray(int[] dataArray, String string){
		System.out.println(string + " --> " + Arrays.toString(dataArray));
	}
}