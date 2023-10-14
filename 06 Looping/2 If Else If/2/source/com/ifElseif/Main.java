package com.ifElseif;

public class Main {
	public static void main(String[] args){
		int a = 7;

		System.out.println("Loading.....");

		if (a < 5 && a > 1) {
			System.out.println("Value 1");
		} else if (a > 5 && a < 9) {
			System.out.println("Value 2");			
		} else {
			System.out.println("ERROR");
		}
		
		System.out.println("FINISH");			
	}
}