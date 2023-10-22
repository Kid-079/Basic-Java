package com.method;

import java.io.FileInputStream;
import java.io.FileReader;
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

		// Combine 2 Exception
		System.out.println();
		System.out.println("-> Combine 2 Exception <-");
		try{
			System.out.printf("index -> %d , -> %d\n", index,array[index]);
			inputFile = new FileInputStream("input.txt");
		} catch (ArrayIndexOutOfBoundsException a){
			System.err.println("Index Out of Bounds");
		} catch (IOException a){
			System.err.println("File Not Found");			
		}

		// Finally
		System.out.println();
		System.out.println("-> Finally <-");
		try{
			System.out.printf("index -> %d , -> %d\n", index,array[index + 1]);
		} catch (ArrayIndexOutOfBoundsException a){
			System.err.println("Index Out of Bounds");
		} finally{
			System.err.println("Finally");			
		}

		System.out.println("\nEnd Program");
	}
}