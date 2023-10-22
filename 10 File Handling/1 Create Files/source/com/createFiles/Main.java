package com.createFiles;

import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		try {
			File data = new File("data1.txt");
			if (data.createNewFile()){
				System.out.println("File created : " + data.getName());
			} else {
				System.out.println("File already exists");				
			}
		} catch (IOException a){
			System.out.println("Error Error Error");
			a.printStackTrace();
		}
	}
}