package com.dataString;

import java.util.Arrays;
import java.lang.String;
import java.util.Formatter;

public class Main {
	public static void main(String[] args){
		String a = "Abcde";
		int b = 10;

		System.out.println("String -> " + a + "\nInteger -> " + b);
		System.out.printf("String -> %s \nInteger -> %d\n", a, b);

		// [argumen-index$]
		System.out.println("\n[argumen_index$]");
		System.out.printf("%1$s, %1$s, %1$s \n", a);
		System.out.printf("%1$d, %1$d, %1$d \n", b);
		System.out.printf("%1$s, %2$d\n",a,b);


		// [flags]
		System.out.println("\n[flags]");
		int c = 5;
		int d = 10;
		int total1 = c - d;
		int total2 = c + d;
		System.out.println(total1);
		System.out.printf("%d - %d = %+d",c,d,total1);
		System.out.printf("\n%d + %d = %d\n",c,d,total2);
	}
}


// NB :
// Conversion
// %s --> string, %d --> integer, %c --> Character. %b --> Boolean, %f --> Float
// Format Structure = %[argumen_index$][flag][width][.precision]conversion


