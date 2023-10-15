package com.whileLoop;

public class Main {
	public static void main(String[] args){
		int a = 0;

		// Break, Continue, Return
		while(true){
			a++;
			if (a == 10) {
				break;
			} else if (a == 5) {
				continue;
			} else if (a == 7) {
				return;
			}
			System.out.println("Loop -> " + a);
		}

		System.out.println("F I N I S H");		
	}
}