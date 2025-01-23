package com.ifElseif;

public class Main {
	public static void main(String[] args){
		int range = 21;

		System.out.println("Loading.....");

		if (range == 5) {
			System.out.println("Range 1 --> " + range);
		} else if (range < 10 && range > 5) {
			System.out.println("Range 2 --> " + range);			
		} else if (range > 15 && range <=20) {
			System.out.println("Range 3 --> " + range);
		} else {
			System.out.println("Out Of Range");
		}
				
		System.out.println("F I N I S H");			
	}
}
