package com.array;

import java.util.Arrays;

public class Main {
	public static void main(String[] args){

		int[] array1 = {1,2,3,4,5};


		// Change Array to String (Public)
		System.out.println(Arrays.toString(array1));

		// Change Array to String (Private)
		System.out.println("\nChange Array to String\n=========================");
		printArray(array1);

		// Copy Array (Private)
		System.out.println("\nCopy Array\n=========================");
		int[] array2 = new int[5];
		printArray(array1);
		printArray(array2);

		// Copy Array with Loop (Private)
		System.out.println("\nCopy Array with Loop\n=========================");
		for(int i = 0; i < array1.length; i++){
			array2[i] = array1[i];
		}
		printArray(array1);
		System.out.println("Address --> " + array1);
		printArray(array2);
		System.out.println("Address --> " + array2);

		// Copy Array with copyOf (Private)
		System.out.println("\nCopy Array with copyOf\n=========================");
		int[] array3 = Arrays.copyOf(array1,3);
		printArray(array1);
		System.out.println("Address --> " + array1);
		printArray(array3);
		System.out.println("Address --> " + array3);

		// Copy Array with copyOfRange (Private)
		System.out.println("\nCopy Array with copyOfRange\n=========================");
		int[] array4 = Arrays.copyOfRange(array1, 2,5);
		printArray(array1);
		System.out.println("Address --> " + array1);
		printArray(array4);
		System.out.println("Address --> " + array4);

		// Fill Array (Private)
		System.out.println("\nFill Array\n=========================");
		int[] array5 = new int[10];
		printArray(array5);
		Arrays.fill(array5, 5);
		printArray(array5);

		// Compare Array (Private)
		System.out.println("\nCompare Array\n=========================");
		int[] array6 = {1,2,3,4,5};
		int[] array7 = {0,1,2,9,6};

		System.out.println("Compare 2 Array");
		System.out.println(Arrays.equals(array6, array7));

		if (array6 == array7){
			System.out.println("Nice One");
		} else {
			System.out.println("Different");			
		}

		System.out.println("\nCheck Array\n=========================");
		System.out.println(Arrays.equals(array6, array7));
		System.out.println("\nCheck Indeks\n=========================");
		System.out.println(Arrays.equals(array6, array7));

		// Sort Array (Private)
		System.out.println("\nSort Array\n=========================");
		int[] array8 = {6,4,1,2,3,4,5,6,5,3,7};

		printArray(array8);
		Arrays.sort(array8);
		printArray(array8);

		// Search Array
		System.out.println("\nSearch Array\n=========================");
		int value = 5;
		int index = Arrays.binarySearch(array8, value);
		System.out.println("Value -> " + value + " --> " + index);
	}

	private static void printArray(int[] dataArray){
		System.out.println("Array --> " + Arrays.toString(dataArray));
	}
}