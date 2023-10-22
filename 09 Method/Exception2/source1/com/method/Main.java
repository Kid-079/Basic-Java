package com.fileHandling;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int[] arrayData = {0,1,2,3,4,5,6,7,8,9};

		Scanner userInput = new Scanner(System.in);
		System.out.print("Insert Data -> ");
		int indexInput = userInput.nextInt();

		// Simple Exception 
		System.out.println("Simple Exception");
		try{
			System.out.printf("Data Array -> %d is %d\n\n", indexInput, arrayData[indexInput - 2]);
		} catch (Exception a){
			System.err.println(a);
		}
	}
}