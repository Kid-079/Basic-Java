package com.dataString;

import java.util.*;

public class Main {
	public static void main(String[] args){
		// Create String
		String string_a = "Nervous";
		char[] char_b = {'S','T','R','O','N','G'};		

		// Print String
		System.out.println(string_a);
		System.out.println(char_b);
		System.out.println(Arrays.toString(char_b));

		// Access char from Array and String
		System.out.println("char from Array Char[] --> " + char_b[4]);
		System.out.println("char from String --> " + string_a.charAt(4));

		// Change String
		char_b[3] = 'U';
		System.out.println(Arrays.toString(char_b));

	}
}
