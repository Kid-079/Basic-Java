package com.function;

import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		System.out.print("Insert Value : ");
		int value = userInput.nextInt();
		System.out.println("Value : " + value);

		printValue(value);

		int total1 = totalValue(value);
		System.out.println("Sum = " + total1);

		int total2 = factorial(value);
		System.out.println("Factorial = " + total2);
	}

	// Recursif Function
		
	// Factorial
	private static int factorial(int parameter){
		System.out.println("Factorial : " + parameter);

		if (parameter == 1){
			return parameter;
		}

		return parameter * factorial(parameter -1);
	}

	// Sum
	private static int totalValue(int parameter){
		System.out.println("Parameter : " + parameter);

		if (parameter == 0){
			return parameter;
		}

		return parameter + totalValue(parameter -1);
	}

	// Print Value
	private static void printValue(int parameter){
		System.out.println("Value : " + parameter);

		if (parameter == 0){
			return;
		}

		parameter--;
		printValue(parameter);

	}
}