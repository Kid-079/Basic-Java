package com.function;

import java.util.*;

public class Main {
	public static void main(String[] args){
		int a, b;
		a = 10;
		b = 5;

		for (int i = 0; i < b; i++){
			for (int j = 0; j < a; j++){
				System.out.print("* ");
			};
			System.out.print("\n");
		}
	}
}