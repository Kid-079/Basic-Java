package com.array;

import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		System.out.println("\nArray Multidimensi\n====================");

		System.out.println("1. Array 2D Assignment");
		int[][] array_2D = {
			{1,2},
			{3,4}
		};
		printArray2D(array_2D);		

		int[][] arrayValue = new int[5][4];
		printArray2D(arrayValue);

		// Looping Foreach
		for(int[] row : arrayValue){
			System.out.print("[");
			for(int value : row){
				System.out.print(value + ",");
			}
			System.out.print("]\n");
		}
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
}