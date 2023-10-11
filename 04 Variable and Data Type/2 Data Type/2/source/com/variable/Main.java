package com.variable;

public class Main {
	public static void main(String[] args){
		// Integer
		int valueInteger  = 10;
		System.out.println("Value Integer = " + valueInteger + " <-- Value Integer 32-bit");

		// Long
		long valueLong = valueInteger;
		System.out.println("Value Long = " + valueLong + " <-- Value Long 64-bit");

		byte valueByte = (byte) valueInteger;
		System.out.println("Value Byte = " + valueByte);
		System.out.println("Value Max = " + Byte.MAX_VALUE);
		System.out.println("Value Min = " + Byte.MIN_VALUE);

	}
}