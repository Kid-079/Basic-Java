package com.dataString;

import java.util.*;

public class Main {
	public static void main(String[] args){
		// Memory From String (String Pool)
		// Tipe Memory in JAVA : Heap, Stak, String Pool

		String string_1 = "nervous";
		String string_2 = "confuse";
		printAddress("String_1 --> ", string_1);
		printAddress("String_2 --> ", string_2);

		String string_3 = "Strong";
		String string_4 = "Struggle";
		String string_5 = "Survive";
		printAddress("String_3 --> ", string_3);
		printAddress("String_4 --> ", string_4);
		printAddress("String_5 --> ", string_5);
	}

	private static void printAddress(String name, String data){
		int address = System.identityHashCode(data);
		System.out.println(name + " -> " + data + "\t|| address = " + Integer.toHexString(address));
	}
}
