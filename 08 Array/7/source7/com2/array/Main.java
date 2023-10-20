package com2.array;

import java.util.Arrays;

public class Main {
	public static void main(String[] args){

		// Count
		int[][] a = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};

		int[][] b = {
			{11,12,13},
			{14,15,16},
			{17,18,19}
		};

		System.out.println("A");
		printArray(a);
		System.out.println("B");
		printArray(b);

		System.out.println("totalValue --> A + B");
		int[][] totalValue1 = count(a, b);
		printArray(totalValue1);		
	}

	private static int[][] count(int[][] matrix_1, int[][] matrix_2){
		int row_1 = matrix_1.length;
		int column_1 = matrix_1[0].length;

		int row_2 = matrix_2.length;		
		int column_2 = matrix_2[0].length;

		int[][] total = new int [row_1][column_1];

		if(row_1 == row_2 && column_1 == column_2){
			for(int i = 0; i < row_1; i++){
				for(int j = 0; j < column_1; j++){
					total[i][j] = matrix_1[i][j] + matrix_2[i][j];
				}
			}
		} else {
			System.out.println("Not Matching");
		}
		return total;
	}

	private static int[][] multiply(int[][] matrix_1, int[][] matrix_2){
		int row_1 = matrix_1.length;
		int column_1 = matrix_2[0].length;

		int row_2 = matrix_1.length;		
		int column_2 = matrix_2[0].length;

		int[][] total = new int[row_1][column_1];

		int buffer;
		for(int i = 0; i < row_1; i++){
			for(int j = 0; j < column_2; j++){
				buffer = 0;
				for(int k = 0; k < column_1; k++){
					buffer += matrix_1[i][k] * matrix_2[k][j];
				}
				total[i][j] = buffer;
			}
		}
			return total;
	}

	// Print ARRAY
	private static void printArray(int[][] dataArray){
		int row = dataArray.length;
		int column = dataArray[0].length;

		for(int i = 0; i < row; i++){
			System.out.print("[");
			for(int j = 0; j < column; j++){
				System.out.print(dataArray[i][j]);

				if(j < column-1){
					System.out.print(",");
				} else {
					System.out.print("]");
				}
			}
			System.out.print("]\n");
		}
		System.out.print("\n");
	}
}