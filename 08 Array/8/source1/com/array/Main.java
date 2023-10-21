package com.array;

import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		StringBuilder string = new StringBuilder();
		printData(string);
	}

	private static void printData(StringBuilder dataString){
		System.out.println("Data     : " + dataString);
		System.out.println("Length   : " + dataString.length());
		System.out.println("Capacity : " + dataString.capacity());

		int addressString = System.identityHashCode(dataString);
		System.out.println("Address  : " + Integer.toHexString(addressString));
	}
}