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
		
		// Read Data with Delimeter
		FileReader fileInput2 = new FileReader("input2.txt");
		BufferedReader bufferedReader = new BufferedReader(fileInput2);
		bufferedReader.mark(200);

		Scanner scanner =  new Scanner(bufferedReader);
		scanner.useDelimiter(",");
		System.out.println(scanner.hasNext());


		while (scanner.hasNext()){
			System.out.println(scanner.next());
		}
	}
}