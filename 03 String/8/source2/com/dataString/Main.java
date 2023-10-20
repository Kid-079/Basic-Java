package com.dataString;

import java.util.*;

public class Main {
	public static void main(String[] args){
		
		String string1 = "abcde";

		// Replace
		String string2 = string1.replace("a","A");
		String string3 = string1.replace("b","B");
		String string4 = string1.replace("ab","AB");
		System.out.println(string1);
		System.out.println(string2);
		System.out.println(string3);
		System.out.println(string4);
	}
}