package newArray.array;

import java.util.Arrays;
import java.lang.StringBuilder;

public class Main {
	public static void main(String[] args){
		// Create New String
		System.out.println("-> Create New String <-");
		StringBuilder string = new StringBuilder("Nervous");
		printData(string);
		System.out.println();

		// Append  --> Create String on New Memory
		System.out.println("-> Append <-");
		string.append(" STRONG");
		printData(string);
		System.out.println();

		// Insert
		System.out.println("-> Insert <-");
		string.insert(14, " Survive");
		printData(string);
		System.out.println();

		// Casting to String
		String a = string.toString();
		System.out.println("Data    : " + string);
		int addressString = System.identityHashCode(string);
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
