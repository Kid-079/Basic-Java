package com.deleteFiles;

import java.io.File;

public class Main {
	public static void main(String[] args){
		int a = 5;
		int b = 2;
		int total1;
		int total2;

		total1 = a * b;
		total2 = a / b;

		File text = new File("data1.txt");
		if(total1 == total2 && a >= b){
			text.delete();
			System.out.println("Delete the files : " + text.getName());
		} else {
			System.out.println("Failed to Delete the File.");
		}
	}
}