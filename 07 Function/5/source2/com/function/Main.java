package com.function;

import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		System.out.print("a = ");
		int a = userInput.nextInt(); 
		System.out.print("b = ");
		int b = userInput.nextInt();

		value(a, b);

		int c = a * b;
		System.out.println("a * b = " + c); 
	}

	private static void value(int a, int b){
		if (a == 5 && b == 10){
			for (int i = 0; i < b; i++ ) {
				for (int j = 0; j < a ;j++ ){
					System.out.print("* ");
				}
				System.out.print("\n");
			}
		} else if (a == 10 && b == 5){
			for (int i = 0; i < b; i++ ) {
				for (int j = 0; j < a ;j++ ){
					System.out.print("* ");
				}
				System.out.print("\n");
			}
		} else {
			System.out.println("Value...");
		}
	}
}