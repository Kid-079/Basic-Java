package com.forLoop;

import java.util.*;

public class Main {
	public static void main(String[] args){
		// Description
		int value_a, value_b, total;
		boolean condition = true;

		// Input 
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Insert Value A : ");
		value_a = userInput.nextInt();	
		
		System.out.print("Insert Value B : ");
		value_b = userInput.nextInt();	

		total = 0;

		// Progress
		while (value_a <= value_b){
			// #1 
			total = total + value_a;
			// #2
			System.out.println(value_a + total);
			value_a++;
		}

		/*
		
		1 + 1 --> 2

		2 + 1 --> 3 + 2 --> 5

		3 + 1 --> 4 + 5 --> 9

		4 + 1 --> 5 + 9 --> 14 

		*/

	}
}