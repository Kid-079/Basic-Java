package com.operatorUnary;

public class Main {
	public static void main(String[] args){
		// Operator Logical
		// AND, OR, XOR, NOT

		boolean a,b,c;

		// OR ( || )
		System.out.println("== OR ==");
		a = true;
		b = true;
		c = (a || b);
		System.out.println(a + " || " + b + " = " + c);

		a = false;
		b = true;
		c = (a || b);
		System.out.println(a + " || " + b + " = " + c);

		a = true;
		b = false;
		c = (a || b);
		System.out.println(a + " || " + b + " = " + c);

		a = false;
		b = false;
		c = (a || b);
		System.out.println(a + " || " + b + " = " + c);

		// AND ( && )
		System.out.println("== NOT ==");
		a = true;
		b = true;
		c = (a && b);
		System.out.println(a + " && " + b + " = " + c);

		a = false;
		b = true;
		c = (a && b);
		System.out.println(a + " && " + b + " = " + c);

		a = true;
		b = false;
		c = (a && b);
		System.out.println(a + " && " + b + " = " + c);

		a = false;
		b = false;
		c = (a && b);
		System.out.println(a + " && " + b + " = " + c);


		// XOR ( ^ )
		System.out.println("== XOR ==");
		a = true;
		b = true;
		c = (a ^ b);
		System.out.println(a + " ^ " + b + " = " + c);

		a = false;
		b = true;
		c = (a ^ b);
		System.out.println(a + " ^ " + b + " = " + c);

		a = true;
		b = false;
		c = (a ^ b);
		System.out.println(a + " ^ " + b + " = " + c);

		a = false;
		b = false;
		c = (a ^ b);
		System.out.println(a + " ^ " + b + " = " + c);


		// NOT ( ! )
		System.out.println("== NOT ==");
		a = true;
		c = !a;
		System.out.println(a + " ---> (!) " + c);

		a = false;
		c = !a;
		System.out.println(a + " ---> (!) " + c);

	}
}