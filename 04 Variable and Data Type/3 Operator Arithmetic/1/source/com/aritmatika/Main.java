package com.aritmatika;

public class Main {
	public static void main(String[] args){
		// Operator ARITMATIKA

		int variable1 = 10;
		int variable2 = 20;

		int total;

		// 1. Sum
			total = variable1 + variable2;
			System.out.println(variable1 + " + " + variable2 + " = " + total);
		// 2. Min
			total = variable1 - variable2;
			System.out.printf("%d - %d = %d \n",variable1,variable2,total);
		// 3. times
			total = variable1 * variable2;
			System.out.printf("%d * %d = %d \n",variable1,variable2,total);
		// 4. divided
			// #1
			total = variable1 / variable2;
			System.out.printf("%d / %d = %d \n",variable1,variable2,total);

			// #2
			float a = 10;
			float b = 20;
			float totalFloat;

			totalFloat = a / b;
			System.out.println(a + " / " + b + " = " + totalFloat + " <---- FLOAT");
		// 5. Modulus
			total = variable1 / variable2;
			System.out.printf("%d %% %d = %d \n",variable1,variable2,total);
	}
}