package com.whileLoop;

public class Main {
	public static void main(String[] args){
		int a = 0;
		boolean condition = true;

		while (condition) {
			System.out.println("Loop -> " + a);
			if (a == 10){
				condition = false;
			}
			a++;
		} 
		System.out.println("FINISH");			
	}
}