package com.inputOutput;

import java.util.*;

public class Main {
	public static void main(String[] args){
		// Create Input
		Scanner userInput = new Scanner(System.in);
		
		// Create Program
		int value_a = 10;
		int verificationValue;
		boolean condition;

		System.out.print("Insert value : ");
		verificationValue = userInput.nextInt();
		System.out.println("Value : " + verificationValue);


		// #1
		// Logical Operator
		condition = (verificationValue == value_a);
		System.out.println("Condition : " + condition);
		System.out.println();

		// #2
		// Boolean (AND, OR)
		System.out.print("Value between 5 and 10 : ");
		verificationValue = userInput.nextInt();

		condition = (verificationValue > 5) && (verificationValue < 10);

		/* 
			Table (&&) AND
			a  |  b  |  c 
			0     0     0
			0     1     0
			1     0     0
			1     1     1

		*/

		System.out.println("Condition : " + condition);

	}
}