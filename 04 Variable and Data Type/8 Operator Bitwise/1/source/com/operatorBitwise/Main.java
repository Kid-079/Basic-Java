package com.operatorBitwise;

public class Main {
	public static void main(String[] args){
		// Operator Bitwise
		// 8 bit --> 1 Byte
		// Bitwise OR ( | ) --- Logical OR ( || )
		// Bitwise NOT ( ~ ) --- Logical NOT ( ! )

		byte a = 1;
		byte b,c;
		String a_bits, b_bits, c_bits;

		// #1
		a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
		System.out.printf("%s = %d \n",a_bits, a);

		
		// Operator SHIFT LEFT
		System.out.println("== SHIFT LEFT (<<) ==");
		a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ','0');
		System.out.printf("%s = %d \n",a_bits, a);
		b = (byte)(a << 5);
		b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
		System.out.printf("%s = %d \n",b_bits, b);

		
		// Operator SHIFT RIGHT
		System.out.println("== SHIFT RIGHT (>>) ==");
		a = 10;
		a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ','0');
		System.out.printf("%s = %d \n",a_bits, a);
		b = (byte)(a >> 1);
		b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
		System.out.printf("%s = %d \n",b_bits, b);

		
		// Operator BITWISE OR
		System.out.println("== BITWISE OR (|) ==");
		a = 15;
		a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ','0');
		System.out.printf("%s = %d \n",a_bits, a);
		
		b = 20;
		b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
		System.out.printf("%s = %d \n",b_bits, b);
		System.out.println("== OR ==");

		c = (byte)(a | b);
		c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
		System.out.printf("%s = %d \n",c_bits, c);

		
		// Operator BITWISE AND
		System.out.println("== BITWISE AND (&) ==");
		a = 15;
		a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ','0');
		System.out.printf("%s = %d \n",a_bits, a);
		
		b = 20;
		b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
		System.out.printf("%s = %d \n",b_bits, b);
		System.out.println("== AND ==");

		c = (byte)(a & b);
		c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
		System.out.printf("%s = %d \n",c_bits, c);

		
		// Operator BITWISE XOR
		System.out.println("== BITWISE XOR (^) ==");
		a = 15;
		a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ','0');
		System.out.printf("%s = %d \n",a_bits, a);
		
		b = 20;
		b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
		System.out.printf("%s = %d \n",b_bits, b);
		System.out.println("== XOR ==");

		c = (byte)(a ^ b);
		c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
		System.out.printf("%s = %d \n",c_bits, c);


		// Operator BITWISE NOT
		System.out.println("== BITWISE NOT (~) ==");
		a = 20;
		b = (byte)(~a);
		a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ','0');
		System.out.printf("%s = %d \n",a_bits, a);
		System.out.println("== NOT ==");

		b_bits = String.format("%8s",Integer.toBinaryString(b).substring(20));
		System.out.printf("%s = %d \n",b_bits, b);
	
	}
}