package com1.array;

import java.util.Arrays;

public class Main {
	public static void main(String[] args){

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
	}

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