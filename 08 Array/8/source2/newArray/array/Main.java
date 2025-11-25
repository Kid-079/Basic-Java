package newArray.array;

import java.util.Arrays;
import java.lang.StringBuilder;

public class Main {
	public static void main(String[] args){
		// Create New String
		System.out.println("-> Create New String <-");
		StringBuilder string = new StringBuilder("Strong");
		printData(string);
		System.out.println();

		// Append  --> Create String on same Memory
		System.out.println("-> Append 1 <-");
		string.append(" STRUGGLE Survive");
		printData(string);
		System.out.println();
		
		System.out.println("-> Append 2 <-");
		string.append(" Nervous");
		printData(string);
		System.out.println();

		// Insert
		System.out.println("-> Insert <-");
		string.insert(32, " CONFUSE");
		printData(string);
		System.out.println();

		// Delete
		System.out.println("-> Delete <-");
		string.delete(7,15);
		printData(string);
		System.out.println();

		// Change Character from Specific index
		System.out.println("-> Change Character Specific Index <-");
		string.setCharAt(3, 'i');
		printData(string);
		System.out.println();

		// Replace
		System.out.println("-> Replace <-");
		string.replace(16, 22, " creepy");
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

