package com.nestedIf;

public class Main {
	public static void main(String[] args){
		int a = 0;
		int b = 5;
		int c = 2;
		int d = 4;

		System.out.println("Loading.....");

		if(a > 0){		
			System.out.println("A");
		} else {
			if (b < 5){
				System.out.println("B");
			} else {
				if (c > 5){		
					System.out.println("C");
				} else if (d == 10){
					System.out.println("D");
				} else {
					System.out.println("E R R O R");
				}
			}
		}
		System.out.println("END PROGRAM");
	}
}