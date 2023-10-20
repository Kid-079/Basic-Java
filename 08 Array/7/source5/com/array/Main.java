package com.array;

import java.util.Arrays;

public class Main {
	public static void main(String[] args){

		int[][] array_2D = {
			{1,2,3},
			{4,5,6},
			{7,8}
		};

		// Access Address
		System.out.println(array_2D);
		System.out.println(Arrays.toString(array_2D));
		System.out.println(array_2D[0]);
		System.out.println(array_2D[1]);

		// Access Value
		System.out.println(Arrays.deepToString(array_2D));
		System.out.println("\n");
	}
}