package com.fileHandling;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int[] arrayData = {0,1,2,3,4,5,6,7,8,9};

		Scanner userInput = new Scanner(System.in);
		System.out.print("Insert Data -> ");
		int indexInput = userInput.nextInt();
		System.out.println();

		// Exception in Function 
		System.out.println("Exception in Function");
		int data1 = takeDataFromArray(arrayData, indexInput);
		System.out.printf("Data from Array -> %d is %d\n\n",indexInput,data1);	

		// Exception throws by Method
		System.out.println("Exception throws by Method");
		int data2 = 0;

		try{
			data2 = takeData(arrayData, indexInput);
		}catch(Exception a){
			System.out.println(a);
		}
		System.out.printf("Data from Array -> %d is %d\n",indexInput,data2);

		System.out.println("\nEnd Program");
	}

	private static int takeData(int[] array, int index) throws  Exception{
		int value = array [index - 1];
		return value;
	}

	private static int takeDataFromArray(int[] array, int index){
		int value = 0;

		try{
			value = array[index + 1];
		}catch(Exception a){
			System.err.println(a);
		}
		return value;
	}
}