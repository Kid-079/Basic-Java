package com.function;

public class Main {
	public static void main(String[] args){
		System.out.println(value());

		functionVoid(" A");
		goodMorning(" B");
		goodMorning(" C");
	}

	private static void goodMorning(String input){
		System.out.println("Good Morning" + input);
	}

	private static void functionVoid(String input){
		System.out.println("Good Morning" + input);
	}

	private static float value(){
		return 10.0f;
	}
}