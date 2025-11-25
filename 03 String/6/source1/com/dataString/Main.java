
package com.dataString;

import java.util.*;

public class Main {
	public static void main(String[] args){

		String string_1 = "ABC";
		String string_2 = "Abc";
		String string_3 = "Abcde";
		printAddress("String_1 --> ", string_1);
		printAddress("String_2 --> ", string_2);
		printAddress("String_3 --> ", string_3);

		string_1 = string_1.substring(0,2);     
		// string_1 = string_1.substring(0,3);
		printAddress("String_1", string_1);

		String string_4 = "ABCDE";
		printAddress("string_4", string_4);

		String string_5 = "ABCDE";
		printAddress("string_5", string_5);
	}

	private static void printAddress(String name, String data){
		int address = System.identityHashCode(data);
		System.out.println(name + " -> " + data + "\t|| address = " + Integer.toHexString(address));
	}
}

