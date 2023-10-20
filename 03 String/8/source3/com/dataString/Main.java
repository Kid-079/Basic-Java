package com.dataString;

import java.util.*;

public class Main {
	public static void main(String[] args){
		// Compare
		String string1 = "abcde";
		String string2 = "ABCDE";
		System.out.println(string1.compareTo(string2));
		System.out.println(string2.compareTo(string1));

		String string3 = "ABCD";
		String string4 = "KLMN";
		System.out.println(string3.compareTo(string4));
		System.out.println(string4.compareTo(string3));

		// Range A ----> a ==> 32
		// Range A ----> K ==> 10
	}
}