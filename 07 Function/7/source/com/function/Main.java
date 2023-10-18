package com.function;

import java.util.*;

public class Main {
	public static void main(String[] args){

		int value_a = 3;
		int value_b = 7;
		int value_c = 2;
		int value_d = 10;

		Scanner userInput = new Scanner(System.in);
		
		int total1 = value_a + value_b;
		if(total1 == 10){			
			System.out.print("a = ");
			int a = userInput.nextInt();
			System.out.println("value_A = " + (a * 5));
		} else {
			System.out.print("ERROR\n");
		}
		
		int total2 = value_c * value_d;
		if(total2 == 20){			
			System.out.print("b = ");
			int b = userInput.nextInt();
			System.out.println("value_B = " + (b * 5));
		} else {
			System.out.print("ERROR\n");
		}
	}
}