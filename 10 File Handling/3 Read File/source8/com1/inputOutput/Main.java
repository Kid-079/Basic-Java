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
		System.out.print("Insert Data : ");
		String input = userInput.next();
		System.out.println("Data Input 1 : " + input);

		// #2 Second Input
		System.out.print("Insert Data : ");
		input = userInput.next();
		System.out.println("Data Input 2 : " + input);

		// Check Data --> Condition False No Data in input.txt
		FileReader fileInput = new FileReader("input.txt");
		BufferedReader bufferedReader = new BufferedReader(fileInput);

		Scanner scanner =  new Scanner(bufferedReader);

		System.out.println(scanner.hasNext());
	}
}