package com.function;

import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		System.out.print("a = ");
		int a = userInput.nextInt(); 
		System.out.print("b = ");
		int b = userInput.nextInt();

		square(a, b);

		System.out.println("valueTotal_A = " + value_A(a, b)); 
		System.out.println("valueTotal_B = " + value_B(a, b)); 

		showValue(a, b);
	}

	private static void showValue(int a, int b){
		System.out.println("valueTotal_A  = " + value_A(a, b)); 
		System.out.println("valueTotal_B  = " + value_B(a, b)); 
	}

	private static int value_A(int a, int b){
		int total =  a * b;
		return total; 
	}

	private static int value_B(int a, int b){
		int total = (a*b)*2;
		return total;
	}

	private static void square(int a, int b){
		for(int i = 0; i < b; i++){
			for (int j = 0; j < a; j++ ) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
}