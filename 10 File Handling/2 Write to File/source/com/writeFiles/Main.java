package com.writeFiles;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		try {
			FileWriter data = new FileWriter("data1.txt");
			data.write("Abcde");
			data.close();
			System.out.println("Successfully write to file.");			
		} catch (IOException a){
			System.out.println("Error Error Error");
			a.printStackTrace();
		}
	}
}