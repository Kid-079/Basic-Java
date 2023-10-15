package com.nestedIf;

import java.util.*;

public class Main {
	public static void main(String[] args){
		String input;

		Scanner userInput = new Scanner(System.in);

		System.out.print("Choose 1, 2, 3, 4, 5 : ");
		input = userInput.next();
		System.out.println(input);

		switch (input) {
			case "1":
				System.out.println("A");
				break;
			case "2":
				System.out.println("B");
				break;
			case "3":
				System.out.println("C");
				break;
			case "4":
				System.out.println("D");
				break;
			case "5":
				System.out.println("E");
				break;
			default:
				System.out.println(input + "Choose Another One");
		}
		System.out.println("END PROGRAM");
	}
}