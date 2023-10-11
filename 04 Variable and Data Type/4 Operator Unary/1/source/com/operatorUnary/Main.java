package com.operatorUnary;

public class Main {
	public static void main(String[] args){
		// Operator UNARY

		int number1 = 1;
		System.out.printf("Unary '-', %d ---> %d \n",number1,-number1);
		System.out.printf("Unary '+', %d ---> %d \n",number1,-number1);

		// Unary Increment and Decrement
		// 1. Increment
		int number2 = 10;
		number2++;
		System.out.println("Value with '++' ---> " + number2 + " <--- INCREMENT");

		// 2. Decrement
		int number3 = 10;
		number3--;
		System.out.println("Value with '--' ---> " + number3 + " <--- DECREMENT");

		// Prefix and Postfix
		// 1. Prefix
		int a = 5;
		System.out.printf("Value '++' prefix --> %d \n", ++a);

		// 2. Postfix
		int b = 5;
		System.out.printf("Value '++' postfix --> %d \n", ++b);
		System.out.printf("Value '--' postfix --> %d \n", --b);
		System.out.printf("Value postfix --> %d \n", b);

		// Unary Boolean with ! negasi. ! ---> BANG! SIGNED!
		// ! --> Cant use on integer
		boolean c = true;
		System.out.println("Boolean Value = " + c);
		System.out.println("Boolean Value = " + !c);
	}
}