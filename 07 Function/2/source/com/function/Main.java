package com.function;

public class Main {
	public static void main(String[] args){
		int a, b;
		a = 20;
		b = value(a);
		System.out.println("a = " + a + " b = " + b);
	}

	private static int value(int input){
		int value;

		// #1
		// value = (input + 2) * input;

		// #2
		value = input * input * input;
		return value;
	}
}