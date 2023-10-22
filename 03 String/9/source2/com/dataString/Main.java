package com.dataString;

import java.util.Arrays;
import java.lang.String;
import java.util.Formatter;

public class Main {
	public static void main(String[] args){
		// [width]
		System.out.println("\n[width]");
		int a = 100000;
		System.out.println("INTEGER");
		System.out.printf("%d\n",a);
		System.out.printf("%5d\n",a);
		System.out.printf("%-10d\n",a);
		System.out.printf("%+10d\n",a);
		System.out.printf("%+-10d\n",a);
		System.out.printf("% 10d\n",a);
		System.out.printf("%010d\n",a);
		System.out.printf("%+10d\n",a);
		System.out.printf("%,10d\n",a);
		int b = 1000000000;
		System.out.printf("%-,15d\n",b);
		
		System.out.println("\nFLOATING POINT");
		float c = 1.543f;
		System.out.printf("%f\n",c);
		System.out.printf("%+9f\n",c);

		// [.precision]
		System.out.println("\n[.precision]");
		float d = 11.111f;
		System.out.printf("%f\n",d);
		System.out.printf("%.1f\n",d);
		System.out.printf("%.2f\n",d);
		System.out.printf("%10.2f\n",d);
		System.out.printf("%010.2f\n",d);
		System.out.printf("%+010.2f\n",d);
	}
}


// NB :
// Conversion
// %s --> string, %d --> integer, %c --> Character. %b --> Boolean, %f --> Float
// Format Structure = %[argumen_index$][flag][width][.precision]conversion


