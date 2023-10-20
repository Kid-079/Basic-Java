package com.dataString;

import java.util.*;

public class Main {
	public static void main(String[] args){
		// Create String
		String string_a = "Abcde";
		char[] char_b = {'A','B','C','D','E'};		

		// Change String
		// -> 1
		System.out.println('B' + string_a.substring(1,5));

		// -> 2
		printAddress("STRING", string_a);
		string_a = "a" + string_a.substring(1,5);
		System.out.println(string_a);

		printAddress("STRING", string_a);
		System.out.println();
		

	}

	private static void printAddress(String name, String data){
		int address = System.identityHashCode(data);
		System.out.println(name + " -> " + data + "\t|| address = " + Integer.toHexString(address));
	}
}