package com.forLoop;

import java.util.*;

public class Main {
	public static void main(String[] args){
		int a, b, c;
		int n;

		Scanner userInput = new Scanner(System.in);
		System.out.print("Value Fibonacci -> n : ");
		n = userInput.nextInt();

		c = 0;
		b = 1;
		a = 1;

		for (int i = 1; i <= n; i++){
			System.out.println("Value n -> : " + i + " --> " + a);
			a = b + c;
			c = b;
			b = a;
		}
	}
}