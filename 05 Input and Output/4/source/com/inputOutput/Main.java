package com.inputOutput;

import java.util.*;

public class Main {
	public static void main(String[] args){
		// Create Input
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