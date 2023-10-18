package com.function;

import java.util.*;

public class Main {
	public static void main(String[] args){

		// SUM
		int a;
		a = sum(4,5);
		printValue(a);

		float b;
		b = sum(4.5f, 4);
		printValue(b);

		b = sum(4, 4.5f);

		a = sum(1,2,3);
		printValue(a);

		// Print Value
		printValue(10);
		printValue(10.5f);
		printValue(10.5d);
	}

	// INTEGER
	private static int sum(int integer1, int integer2){
		return integer1 + integer2;
	}

	// FLOAT
	private static float sum(float float1, float float2){
		return float1 + float2;
	}

	// INTEGER AND FLOAT
	private static float sum(int integer2, float float1){
		return integer2 + float1;
	}

	// INTEGER (3 Parameter)
	private static int sum(int integer1, int integer2, int integer3){
		return integer1 + integer2 + integer3;
	}

	// DOUBLE
	private static void printValue(double valueDouble){
		System.out.println("Value Double--> " + valueDouble);
	}

	// FLOAT
	private static void printValue(float valueFloat){
		System.out.println("Value Float--> " + valueFloat);
	}

	// INTEGER
	private static void printValue(int valueInteger){
		System.out.println("Value Integer--> " + valueInteger);
	}
}