package com.deleteFiles;

import java.io.File;

public class Main {
	public static void main(String[] args){
		boolean a = true;

		File text = new File("data1.txt");
		if(a == true){
			text.delete();
			System.out.println("Delete the files : " + text.getName());
		} else {
			System.out.println("Failed to Delete the File.");
		}
	}
}