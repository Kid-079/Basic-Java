package com.nestedIf;

public class Main {
	public static void main(String[] args){
		int a = 10; 
		int b = 20;
		int c = 0;
		boolean condition = true; 

		if (a == 10 && b == 20){
			System.out.println("Matching, checkValue first..");
			if (condition == true) {
				System.out.println("........");
			} else if (condition == false){
				System.out.println("condition a or b not True, Check..");
				if (c != 0) {
					System.out.println("Break");
				} else {
					System.out.println("A Condition True, ........");
				}			
			} else {
				System.out.println("condition True");
			}
		} else if (a != 10 && b == 20){
			System.out.println("Not Matching, checkValue first..");
			if (condition == true) {
				System.out.println("condition a not true, Break");
			} else if (condition == false) {
				System.out.println("Condition a True, Check...");
				if (c == 0){
					System.out.println("A Conditon True, ........");
				} else {
					System.out.println("Break");	
				}
			} else {
				System.out.println("........");					
			}
		} else if (a == 10 && b != 20){
			System.out.println("Not Matching, checkValue first..");
			if (condition == true) {
				System.out.println("condition b not true, Break");
			} else if (condition == false){
				System.out.println("Condition b True, Check...");
				if (c == 0){
					System.out.println("A Condition True, ........");
				} else {
					System.out.println("Break");	
				}
			} else {
				System.out.println(".........");						
			}
		} else {
			System.out.println("Condition a and b not true, Break");
		}
	}
}