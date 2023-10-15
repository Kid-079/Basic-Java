package com.doWhile;

public class Main {
	public static void main(String[] args){
		int a = 0;
		boolean condition = true;

		do {
			System.out.println("Loop -> " + a);
			a++;
			if (a == 10){
				condition = false;
			}
		} while (condition);
		
		System.out.println("FINISH");			
	}
}