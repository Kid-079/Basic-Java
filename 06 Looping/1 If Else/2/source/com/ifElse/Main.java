package com.ifElse;

import java.util.*;

public class Main {
	public static void main(String[] args){

		int input, value;
		Scanner userInput = new Scanner(System.in);

		System.out.println("Insert Value : ");
		input = userInput.nextInt();

		// variable x = Expression ? Statement_true : Statement_false
		// #1
		value = (input == 10) ? (input*input) : (input/2);
		
		// #2
		// if(input == 10){
		// 	value = input*input;
		// } else {
		// 	value = input/2;
		// }

		// Boolean Data Type
		if(input == 50){
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
		System.out.println("Total : " + value);
	}
}