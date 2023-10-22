package com.readFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try {
			File text = new File("data1.txt");
			Scanner readData = new Scanner(text);
			while(readData.hasNextLine()){
				String data = readData.nextLine();
				System.out.println(data);
			}
			readData.close();
		} catch (FileNotFoundException a){
			System.out.println("Error Error Error");
			a.printStackTrace();
		}
	}
}