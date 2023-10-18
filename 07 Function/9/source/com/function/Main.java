package com.function;

import java.util.*;
import java.lang.String;  // <-- Use String


public class Main {
	public static void main(String[] args){
		System.out.print("Fibonacci \n");

		Scanner userInput = new Scanner(System.in);
		System.out.print("Insert Value a = ");
		int value = userInput.nextInt();
		int value_fibonacci = fibonacci(5, "up");
		System.out.println("Fibonacci Value -> " + value + " ---> " + value_fibonacci);
	}

	private static int fibonacci(int a, String b){
		System.out.println("--> " + b);
		System.out.println("Fibonacci -> " + a);

		if (a == 1 || a == 0) {
			return a;
		} else {
			return fibonacci(a - 1, "Left") + fibonacci(a - 2, "Right");
		}
	}
}