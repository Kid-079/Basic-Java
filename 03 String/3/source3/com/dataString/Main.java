package com.dataString;

import java.util.*;

public class Main {
	public static void main(String[] args){
		// Create String
		String string_a = "Confuse";
		char[] char_b = {'R','E','F','L','E','K'};		

		// Print String
		System.out.println(string_a);
		System.out.println(char_b);
		System.out.println(Arrays.toString(char_b));

		// Access char from Array and String
		System.out.println("char from Array Char[] --> " + char_b[3]);
		System.out.println("char from String --> " + string_a.charAt(6));

		// Change String
		char_b[2] = 'P';
		System.out.println(Arrays.toString(char_b));
	}
}
