package com.aritmatika;

public class Main {
	public static void main(String[] args){
		// 1. Integer
		int a = 10;
		int b = 20;

		float c = a/b;

		System.out.printf("%d / %d = %f \n",a,b,c);
		System.out.println("\n");

		// 2. Float
		float x = 10;
		int y = 20;

		float z = x/y;

		System.out.printf("%f / %d = %f \n",x,y,z);
		System.out.println("\n");

		// 3. Float
		int i = 10;
		int j = 20;

		float k = (float)i/j;

		System.out.printf("%d / %d = %f \n",i,j,k);	

	}
}