package com.dataString;

import java.util.*;

public class Main {
	public static void main(String[] args){
		
		String string1 = "abcde";

		// Access char from string
		System.out.println(string1.charAt(2));

		// Substring
		String character = string1.substring(3,5);
		System.out.println(character);

		// Concatenation (Concat)
		String string2 = character + " ABC";
		System.out.println(string2);

		character = character + " abc";
		System.out.println(character);

		// Concat with Non String
		int value = 20;
		String string3 = character + " " + value;

		System.out.println(string3);
		System.out.println(character + " " + value);

		// Lowercase and Uppercase
		System.out.println(string1.toUpperCase());
		System.out.println(string1.toLowerCase());

	}
}