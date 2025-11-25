package com.dataString;

import java.util.*;

public class Main {
	public static void main(String[] args){
		// Create String
		String string_a = "Nervous";
		char[] char_b = {'S','T','R','O','N','G'};		

		// Change String
		// -> 1
		System.out.println('p' + string_a.substring(3,4));
		System.out.println('e' + string_a.substring(5));

		// -> 2
		printAddress("Really ", string_a);
		string_a = "p" + string_a.substring(3,4);
		string_a = "e" + string_a.substring(5);
		System.out.println(string_a);

		printAddress("Really ", string_a);
		System.out.println();
		
	}

	private static void printAddress(String name, String data){
		int address = System.identityHashCode(data);
		System.out.println(name + " -> " + data + "\t|| address = " + Integer.toHexString(address));
	}
}
