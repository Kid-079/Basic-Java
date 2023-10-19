package com.array;

import java.util.Arrays;

public class Main {
	public static void main(String[] args){

		int[] array1 = {1,2,3,4,5};

		// Looping with Arrays Properties
		System.out.println("Value = " + array1.length);
		System.out.println();
		for(int i = 0; i < array1.length; i++){
			System.out.println("Indeks -> " + i + " --> " + array1[i]);
		}

	}
}