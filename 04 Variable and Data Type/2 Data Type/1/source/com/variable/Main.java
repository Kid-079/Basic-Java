package com.variable;

public class Main {
	public static void main(String[] args){
		// Data Type in JAVA
		// integer, byte, short, long, double, float, char, boolean
		// 1 byte = 8 bit
		// Size Integer --> 4 byte = 4 x 8 = 32 bit
		// Primitif Data Type --> Absolute Value

		// String --> High Level Data Type

		// Integer
		int a = 10;
		System.out.println("=====INTEGER=====");
		System.out.println("Value Integer a = " + (a + 1));
		System.out.println("Max Value = " + Integer.MAX_VALUE);
		System.out.println("Min Value = " + Integer.MIN_VALUE);
		System.out.println("Size Integer = " + Integer.BYTES + " bytes");
		System.out.println("Size Integer = " + Integer.SIZE + " bit");
		System.out.println("\n");

		// Byte
		int b = 10;
		System.out.println("=====BYTE=====");
		System.out.println("Value Byte b = " + (b + 1));
		System.out.println("Max Value = " + Byte.MAX_VALUE);
		System.out.println("Min Value = " + Byte.MIN_VALUE);
		System.out.println("Size Byte = " + Byte.BYTES + " bytes");
		System.out.println("Size Byte = " + Byte.SIZE + " bit");
		System.out.println("\n");

		// Short
		short c = 10;
		System.out.println("=====SHORT=====");
		System.out.println("Value Short c = " + (c + 1));
		System.out.println("Max Value = " + Short.MAX_VALUE);
		System.out.println("Min Value = " + Short.MIN_VALUE);
		System.out.println("Size Short = " + Short.BYTES + " bytes");
		System.out.println("Size Short = " + Short.SIZE + " bit");
		System.out.println("\n");

		// Long
		long d = 10L;
		System.out.println("=====LONG=====");
		System.out.println("Value Long d = " + (d + 1));
		System.out.println("Max Value = " + Long.MAX_VALUE);
		System.out.println("Min Value = " + Long.MIN_VALUE);
		System.out.println("Size Long = " + Long.BYTES + " bytes");
		System.out.println("Size Long = " + Long.SIZE + " bit");
		System.out.println("\n");

		// Double 
		double e = -10.5d;
		System.out.println("=====DOUBLE=====");
		System.out.println("Value Double e = " + (e + 1));
		System.out.println("Max Value = " + Double.MAX_VALUE);
		System.out.println("Min Value = " + Double.MIN_VALUE);
		System.out.println("Size Double = " + Double.BYTES + " bytes");
		System.out.println("Size Double = " + Double.SIZE + " bit");
		System.out.println("\n");

		// Float
		float f = 10.5f;
		System.out.println("=====FLOAT=====");
		System.out.println("Value Float f = " + (f + 1));
		System.out.println("Max Value = " + Float.MAX_VALUE);
		System.out.println("Min Value = " + Float.MIN_VALUE);
		System.out.println("Size Double = " + Float.BYTES + " bytes");
		System.out.println("Size Double = " + Float.SIZE + " bit");
		System.out.println("\n");

		// Char (ASCII Code)
		char g = 'A';
		System.out.println("=====Character=====");
		System.out.println("Value Character g = " + (g + 1));
		System.out.println("Max Value = " + Float.MAX_VALUE);
		System.out.println("Min Value = " + Float.MIN_VALUE);
		System.out.println("Size Double = " + Float.BYTES + " bytes");
		System.out.println("Size Double = " + Float.SIZE + " bit");
		System.out.println("\n");

		// Boolean (True, False)
		Boolean value = true;
		System.out.println("=====BOOLEAN=====");
		System.out.println("Value Boolean Value = " + value);
		System.out.println("Max Value = " + Boolean.TRUE);
		System.out.println("Min Value = " + Boolean.FALSE);
		// Boolean --> Value 1 byte
	}
}