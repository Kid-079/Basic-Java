package com.dataString;

import java.util.*;

public class Main {
	public static void main(String[] args){
		// Create String
		String string_a = "Abcde";
		char[] char_b = {'A','B','C','D','E'};		

		// Print String
		System.out.println(string_a);
		System.out.println(char_b);
		System.out.println(Arrays.toString(char_b));

		// Access char from Array and String
		System.out.println("char from Array Char[] --> " + char_b[0]);
		System.out.println("char from String --> " + string_a.charAt(2));

		// Change String
		char_b[4] = 'A';
		System.out.println(Arrays.toString(char_b));

	}
}