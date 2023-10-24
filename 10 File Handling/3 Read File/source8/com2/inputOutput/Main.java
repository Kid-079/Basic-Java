package com.inputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		// Create User Input
		Scanner userInput = new Scanner(System.in);

		// #1 First Input
		int a = 1;
		System.out.print("Insert Data : ");
		String input = userInput.next();
		if (a == 10){
			System.out.println("Data Input 1 : " + input);
		} else {
			System.out.println("Condition False, Unable to input data");	
		}

		// #2 Second Input
		int b = 20;
		System.out.print("Insert Data : ");
		input = userInput.next();
		if (b == 20){
			System.out.println("Data Input 2 : " + input);
		} else {
			System.out.println("Condition False, unable to input data");
		}

		// Read Data use File Input.txt
		FileReader fileInput = new FileReader("input1.txt");
		BufferedReader bufferedReader = new BufferedReader(fileInput);

		Scanner scanner =  new Scanner(bufferedReader);

		// Check Data --> Condition False No Data in input.txt
		System.out.println(scanner.hasNext());

		// Read Data
		System.out.println(scanner.next());
		System.out.println(scanner.next());
		// System.out.println(scanner.next());
		// System.out.println(scanner.next());
		// System.out.println(scanner.next());
	}
}