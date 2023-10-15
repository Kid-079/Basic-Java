package com.forLoop;

public class Main {
	public static void main(String[] args){
		System.out.println("Loop 1");
		for (int a = 0; a <= 10; a++){
			System.out.println(a);
		}

		System.out.println("Loop 2");
		for (int a = 10; a >= 5; a--){
			System.out.println(a);
		}	

		System.out.println("Loop 3");
		int a = 0;
		for (; a < 10;){
			System.out.println(a);
			a++;
		}	
	}
}