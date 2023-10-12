package com.operatorUnary;

public class Main {
	public static void main(String[] args){
		// Operator Relational

		int a, b;
		boolean valueRelational;

		// Equal
		// #1
		System.out.println("== EQUAL ==");
		a = 10;
		b = 10;
		valueRelational = (a == b);
		System.out.printf("%d == %d --> %s \n", a,b,valueRelational);

		// #2
		a = 20;
		b = 10;
		valueRelational = (a == b);
		System.out.printf("%d == %d --> %s \n", a,b,valueRelational);


		// Not Equal
		// #1
		System.out.println("== NOT EQUAL ==");
		a = 10;
		b = 10;
		valueRelational = (a != b);
		System.out.printf("%d != %d --> %s \n", a,b,valueRelational);

		// #2
		a = 20;
		b = 10;
		valueRelational = (a != b);
		System.out.printf("%d != %d --> %s \n", a,b,valueRelational);


		// Less than
		// #1
		System.out.println("== LESS THAN ==");
		a = 10;
		b = 10;
		valueRelational = (a < b);
		System.out.printf("%d < %d --> %s \n", a,b,valueRelational);

		// #2
		a = 20;
		b = 10;
		valueRelational = (a < b);
		System.out.printf("%d < %d --> %s \n", a,b,valueRelational);


		// Greater than
		// #1
		System.out.println("== GREATER THAN ==");
		a = 10;
		b = 10;
		valueRelational = (a > b);
		System.out.printf("%d > %d --> %s \n", a,b,valueRelational);

		// #2
		a = 20;
		b = 10;
		valueRelational = (a > b);
		System.out.printf("%d > %d --> %s \n", a,b,valueRelational);


		// Less than equal an Greater than equal
		// #1
		System.out.println("== LESS THAN EQUAL and GREATER THAN EQUAL ==");
		a = 10;
		b = 10;
		valueRelational = (a >= b);
		System.out.printf("%d >= %d --> %s \n", a,b,valueRelational);

		// #2
		a = 20;
		b = 10;
		valueRelational = (a <= b);
		System.out.printf("%d <= %d --> %s \n", a,b,valueRelational);

	}
}