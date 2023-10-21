package com.array;

import java.util.Arrays;
import java.lang.StringBuilder;

public class Main {
	public static void main(String[] args){
		// Create New String
		System.out.println("-> Create New String <-");
		StringBuilder string = new StringBuilder("Abcde");
		printData(string);
		System.out.println();

		// Append  --> Create String on New Memory
		System.out.println("-> Append <-");
		string.append(" ABCDE");
		printData(string);
		System.out.println();

		// Concat  --> Create String in New Memory
		System.out.println("-> Concat <-");
		String string_a = "abcde";
		string_a = string_a.concat(" ABCDE");

		System.out.println("Data    : " + string_a);
		System.out.println("Length  : " + string_a.length());
		
		int addressString = System.identityHashCode(string_a);
		System.out.println("Address : " + Integer.toHexString(addressString));			
	}

	private static void printData(StringBuilder dataString){
		System.out.println("Data     : " + dataString);
		System.out.println("Length   : " + dataString.length());
		System.out.println("Capacity : " + dataString.capacity());

		int addressString = System.identityHashCode(dataString);
		System.out.println("Address  : " + Integer.toHexString(addressString));
	}
}