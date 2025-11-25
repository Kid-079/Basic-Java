package com.dataString;

import java.util.*;

public class Main {
	public static void main(String[] args){

		String string_1 = "Strong";
		String string_2 = "Struggle";
		String string_3 = "Survive";
		printAddress("String_1 --> ", string_1);
		printAddress("String_2 --> ", string_2);
		printAddress("String_3 --> ", string_3);

		string_1 = string_1.substring(0,5);     
		// string_1 = string_1.substring(0,3);
		// string_2 = string_2.substring(0,3);
		printAddress("String_1", string_1);
		// printAddress("String_2", string_2);

		String string_4 = "Nervous";
		printAddress("string_4", string_4);

		String string_5 = "Confuse";
		printAddress("string_5", string_5);
	}

	private static void printAddress(String name, String data){
		int address = System.identityHashCode(data);
		System.out.println(name + " -> " + data + "\t|| address = " + Integer.toHexString(address));
	}
}
