package com.deleteFiles;

import java.io.File;

public class Main {
	public static void main(String[] args){
		int a = 20;
		int b = 30;
		int c = 40;
		int d = 50;
		boolean condition = true;

		File text = new File("data1.txt");
		if((a > 5 && b % 2 == 0) && (c % 2 == 1 && d < 5)){
			if(condition == true){
				text.delete();
				System.out.println("Delete the files : " + text.getName());
			} 
		} else {
			System.out.println("Failed to Delete the Files.");
		}
	}
}