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
		System.out.println("c = " + c); 
	}

	public static void value(int a, int b){
		for (int i = 0; i < b; i++ ) {
			for (int j = 0; j < a ;j++ ){
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
}