package com.operatorUnary;

public class Main {
	public static void main(String[] args){
		// Operator Assignment

		// Assignment Operator Sum
		int a = 1;
		a += 10;   // a = a + 10;
		System.out.println("Value a = " + a + " <-- SUM");

		// Assignment Operator Min
		int b = 10;
		b -= 5;   // b = b - 10;
		System.out.println("Value b = " + b + " <-- MIN");
		
		// Assignment Operator Times
		int c = 5;
		c *= 5;   // a = a + 10;
		System.out.println("Value c = " + c + " <-- TIMES");
		
		// Assignment Operator Divided
		int d = 4;
		d /= 2;   // a = a + 10;
		System.out.println("Value d = " + d + " <-- DIVIDED");

		// Assignment Operator Modulus
		int e = 11;
		e %= 5;   // a = a + 10;
		System.out.println("Value e = " + e + " <-- MODULUS");
	}
}