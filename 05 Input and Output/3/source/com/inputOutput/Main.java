package com.inputOutput;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		// No Input
		int total1 = 1 * 2 + 10 / 2;
		System.out.println("Total = " + total1);
		int total2 = 2 * 5 / 2;
		System.out.println("Total = " + total2);
		int total3 = 50 / (1 + 4);
		System.out.println("Total = " + total3);

		// Create Input
		// #1
		Scanner userInput = new Scanner(System.in);
		System.out.println("============");
		int a,b,c;

		System.out.print("a = ");
		a = userInput.nextInt();
		System.out.print("b = ");
		b = userInput.nextInt();
		System.out.print("c = ");
		c = userInput.nextInt();

		int value = (a * b * c) + c;

		System.out.println("Value = " + value);

		// #2
		Scanner userInput = new Scanner(System.in);
		System.out.println("============");
		int a,b,c;

		System.out.print("a = ");
		a = userInput.nextInt();
		System.out.print("b = ");
		b = userInput.nextInt();
		System.out.print("c = ");
		c = userInput.nextInt();

		int value = (a * b) + (b * c) + b;

		System.out.println("Value = " + value);


	}
}