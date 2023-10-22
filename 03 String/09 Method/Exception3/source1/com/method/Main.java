package com.method;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		// Method Exception
		int[] array = {0,1,2,3,4,5,6,7,8,9};

		Scanner userInput = new Scanner(System.in);
		FileInputStream inputFile = null;
		System.out.print("Array -> ");
		int index = userInput.nextInt();

		// Exception Handling (Try, Catch, Finally)
		System.out.println("Handling Out of Bound");
		try{
			System.out.printf("index -> %d, -> %d\n",index,array[index]);
		} catch (Exception a){
			System.err.println(a);
		}

	}
}