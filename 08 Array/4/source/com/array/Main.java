package com.array;

import java.util.Arrays;

public class Main {
	public static void main(String[] args){

		int[] array1 = {1,2,3,4,5,6,7,8,9};

		// Looping with 
		System.out.println();
		System.out.println("Looping for Each");
		for(int value : array1){
			System.out.println("Value in Array --> " + value);
		}
	}
}