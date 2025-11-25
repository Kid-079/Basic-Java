
package com.dataString;

import java.util.*;

public class Main {
	public static void main(String[] args){
		
		// Create String with New Method
		String a = new String("Abcde");
		printAddress("String --> ", a);

	}

	private static void printAddress(String name, String data){
		int address = System.identityHashCode(data);
		System.out.println(name + " -> " + data + "\t|| address = " + Integer.toHexString(address));
	}
}

