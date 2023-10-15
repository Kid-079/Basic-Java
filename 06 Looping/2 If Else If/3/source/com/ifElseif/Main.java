package com.switchCase;

import java.util.*;

public class Main {
	public static void main(String[] args){
		// DESCRIPTION
		Scanner userInput;
		float a,b,total;
		char operator;

		userInput = new Scanner(System.in);

		// INPUT
		System.out.println("Choose Operator == +, -, *, / ==");
		System.out.print("Value a : ");
		a = userInput.nextFloat();
		System.out.print("Value operator : ");
		operator = userInput.next().charAt(0);
		System.out.print("Value b : ");
		b = userInput.nextFloat();

		System.out.println("user Input : " + a + " " + operator + " " + b);

		// PROGRESS
		if (operator == '+'){
			// SUM
			total = a + b;
			System.out.println("Total = " + total);
		} else if (operator == '-'){
			// MINUS
			total = a - b;
			System.out.println("Total = " + total);		
		} else if (operator == '*'){
			// TIMES
			total = a * b;
			System.out.println("Total = " + total);	
		} else if (operator == '/'){
			// DIVIDED
			if (b == 0){
				System.out.println("infinity");
			}
			total = a / b;
			System.out.println("Total = " + total);
		} else {
			System.out.println("Operator Not Found");
		}
	}
}