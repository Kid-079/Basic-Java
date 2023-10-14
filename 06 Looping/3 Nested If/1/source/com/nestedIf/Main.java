package com.nestedIf;

public class Main {
	public static void main(String[] args){
		int a = 5;
		int b = 1;

		System.out.println("Loading.....");

		if (a == 1) {
			if (b == 2) {
				System.out.println("2 Condition TRUE");
			} else {
				System.out.println("A Condition TRUE");				
			}		
		} else {
			System.out.println("Value Not Identified");
		}
		System.out.println("FINISH");
	}
}