package com.doWhile;

public class Main {
	public static void main(String[] args){
		int range = 0;		
		boolean condition = false;

		do {
			System.out.println("Out Of Range -> " + range);
			range++;
			if (range == 5){
				System.out.println("Range 1" + range);
				condition = true;
			}
		} while (condition);
		
		System.out.println("F I N I S H");			
	}
}
