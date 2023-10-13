package com.inputOutput;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		// Create Input
		Scanner userInput = new Scanner(System.in);
		int a, b, c;

		// Create Simple Program
		System.out.println("====");
		System.out.print("a = ");
		a = userInput.nextInt();
		System.out.print("b = ");
		b = userInput.nextInt();

		c = a * b;
		System.out.println("c = " + c);

	}
}