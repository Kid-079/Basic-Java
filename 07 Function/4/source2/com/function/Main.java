package com.function;

import java.util.*;

public class Main {
	public static void main(String[] args){
		value(5, 10);
	}

	public static void value (int a, int b){
		for (int i = 0; i < b; i++){
			for (int j = 0; j < a; j++){
				System.out.print("* ");
			};
			System.out.print("\n");
		}
	}
}