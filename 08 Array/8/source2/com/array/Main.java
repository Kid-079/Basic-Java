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

		// Append  --> Create String on same Memory
		System.out.println("-> Append 1 <-");
		string.append(" ABCDE Abcde");
		printData(string);
		System.out.println();
		
		System.out.println("-> Append 2 <-");
		string.append(" abc");
		printData(string);
		System.out.println();

		// Insert
		System.out.println("-> Insert <-");
		string.insert(10, " ABCDE");
		printData(string);
		System.out.println();

		// Delete
		System.out.println("-> Delete <-");
		string.delete(10,20);
		printData(string);
		System.out.println();

		// Change Character from Specific index
		System.out.println("-> Change Character Specific Index <-");
		string.setCharAt(15, 'A');
		printData(string);
		System.out.println();

		// Replace
		System.out.println("-> Replace <-");
		string.replace(5, 10, " abcde");
		printData(string);
		System.out.println();
	}

	private static void printData(StringBuilder dataString){
		System.out.println("Data     : " + dataString);
		System.out.println("Length   : " + dataString.length());
		System.out.println("Capacity : " + dataString.capacity());

		int addressString = System.identityHashCode(dataString);
		System.out.println("Address  : " + Integer.toHexString(addressString));
	}
}