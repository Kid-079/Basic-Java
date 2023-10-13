package com.inputOutput;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		// Create Input
		Scanner userInput = new Scanner(System.in);

		int input1 = userInput.nextInt();
		int input2 = userInput.nextInt();

		int total = input1 + input2;
		System.out.println("Total = " + total);

	}
}