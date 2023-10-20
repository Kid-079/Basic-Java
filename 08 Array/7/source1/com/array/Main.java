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

		System.out.println("2. Array 2D Assignment");
		int[][] array_2D_2 = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		printArray2D(array_2D_2);

		System.out.println("3. Create array with Different Size of Array");
		int[][] array_2D_3 = {
			{1,2,3,4},
			{5,6,7,8,9},
			{0}
		};
		printArray2D(array_2D_3);	
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