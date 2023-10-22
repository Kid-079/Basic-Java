package com.deleteFiles;

import java.io.File;

public class Main {
	public static void main(String[] args){
		int a = 5;
		int b = 20;
		int c = 30;
		int d = 40;
		boolean condition = true;

		File text = new File("data1.txt");
		if((a == 10 && b == 20) && (c == 30 && d == 40)){
			if(condition == true){
				text.delete();
				System.out.println("Delete the files : " + text.getName());
			} 
		} else {
			System.out.println("Failed to Delete the Files.");
		}
	}
}