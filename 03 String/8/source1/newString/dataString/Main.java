package newString.dataString;

import java.util.*;

public class Main {
	public static void main(String[] args){
		
		String string1 = "Strong";

		// Access char from string
		System.out.println(string1.charAt(3));

		// Substring
		String character = string1.substring(3,5);
		System.out.println(character);

		// Concatenation (Concat)
		String string2 = character + " Struggle";
		System.out.println(string2);

		character = character + " Survive";
		System.out.println(character);

		// Concat with Non String
		int value = 20;
		String string3 = character + " " + value;

		System.out.println(string3);
		System.out.println(character + " " + value);

		// Lowercase and Uppercase
		System.out.println(string1.toUpperCase());
		System.out.println(string1.toLowerCase());

	}
}
