package com.switchCase;

import java.util.*;

public class Main {
	public static void main(String[] args){
		// DESCRIPTION
		Scanner userInput;
		float a,b,total;
		String operator;

		userInput = new Scanner(System.in);

		// INPUT
		System.out.println("Choose Operator == +, -, *, / ==");
		System.out.print("Value a : ");
		a = userInput.nextFloat();
		System.out.print("Value operator : ");
		operator = userInput.next();
		System.out.print("Value b : ");
		b = userInput.nextFloat();

		// PROGRESS
		switch(operator){
			// SUM
			case "+":
				total = a + b;
				System.out.println("Sum " + total);
				break;
			// MINUS
			case "-":
				total = a - b;
				System.out.println("Minus " + total);
				break;
			// TiMES
			case "*":
				total = a * b;
				System.out.println("Times " + total);
				break;
			// DIVIDED
			case "/":
				total = a / b;
				System.out.println("Divided " + total);
				break;
			default:
				System.out.println("Operator" + operator + "Not Found");
				break;				
		}
	}
}