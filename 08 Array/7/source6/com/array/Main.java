package com.array;

import java.util.Arrays;

public class Main {
	public static void main(String[] args){

		char[] array_char1 = {'a','b','c'};
		char[] array_char2 = {'d','e'};

		char[][] array_char_2D = {
			array_char1,
			array_char2
		};

		// Access Address
		System.out.println(array_char_2D);
		
		System.out.println(System.identityHashCode(array_char1));
		System.out.println(System.identityHashCode(array_char2));
		
		System.out.println(Integer.toHexString(System.identityHashCode(array_char1)));
		System.out.println(Integer.toHexString(System.identityHashCode(array_char2)));
		
		// Access Address
		System.out.println(Arrays.toString(array_char_2D));
		// Access Value
		System.out.println(Arrays.deepToString(array_char_2D));
	}
}